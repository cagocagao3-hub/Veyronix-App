package app.veyronix

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    private val background = Color.rgb(17, 19, 29)
    private val surface = Color.rgb(29, 32, 47)
    private val purple = Color.rgb(116, 101, 245)
    private val muted = Color.rgb(164, 169, 191)

    private fun dp(value: Int): Int =
        (value * resources.displayMetrics.density).toInt()

    private fun label(
        value: String,
        size: Float,
        color: Int,
        bold: Boolean = false
    ) = TextView(this).apply {
        text = value
        textSize = size
        setTextColor(color)
        if (bold) setTypeface(typeface, Typeface.BOLD)
        setPadding(dp(4), dp(5), dp(4), dp(5))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = background
        window.navigationBarColor = background

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(background)
            setPadding(dp(18), dp(24), dp(18), dp(16))
        }

        val header = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }

        header.addView(TextView(this).apply {
            text = "V"
            textSize = 25f
            setTextColor(Color.WHITE)
            setTypeface(typeface, Typeface.BOLD)
            gravity = Gravity.CENTER
            setBackgroundColor(purple)
            layoutParams = LinearLayout.LayoutParams(dp(48), dp(48))
        })

        val identity = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(12), 0, 0, 0)
        }
        identity.addView(label("VEYRONIX", 21f, Color.WHITE, true))
        identity.addView(label("COMMUNITY PLATFORM", 10f, muted, true))
        header.addView(identity)
        root.addView(header)

        root.addView(label("Bem-vindo ao Veyronix", 25f, Color.WHITE, true).apply {
            setPadding(0, dp(32), 0, dp(4))
        })
        root.addView(label(
            "Seu espaço para conversar e criar comunidades.",
            14f,
            muted
        ))

        val intro = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(18), dp(18), dp(18), dp(18))
            setBackgroundColor(surface)
            val params = LinearLayout.LayoutParams(-1, -2)
            params.topMargin = dp(24)
            layoutParams = params
        }
        intro.addView(label("Sua comunidade começa aqui", 18f, Color.WHITE, true))
        intro.addView(label(
            "Esta é a primeira fundação instalável. Os próximos módulos vão adicionar contas, servidores, canais e conversas reais.",
            14f,
            muted
        ))
        root.addView(intro)

        root.addView(label("MÓDULOS PLANEJADOS", 11f, purple, true).apply {
            setPadding(0, dp(24), 0, dp(8))
        })

        listOf(
            "Contas e confirmação por e-mail",
            "Servidores, categorias e canais",
            "Mensagens em tempo real",
            "Voz, vídeo e compartilhamento de tela"
        ).forEach { item ->
            root.addView(label("◈   $item", 14f, Color.rgb(225, 226, 239)).apply {
                setPadding(dp(12), dp(13), dp(12), dp(13))
                setBackgroundColor(surface)
                val params = LinearLayout.LayoutParams(-1, -2)
                params.bottomMargin = dp(8)
                layoutParams = params
            })
        }

        root.addView(label(
            "VEYRONIX  •  VERSÃO 0.1.0",
            10f,
            muted
        ).apply {
            gravity = Gravity.CENTER
            setPadding(0, dp(24), 0, 0)
        })

        setContentView(root)
    }
}
