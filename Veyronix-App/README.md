# Veyronix

Fundação inicial do aplicativo Android Veyronix.

## O que já está incluído
- Projeto Android nativo em Kotlin.
- Interface inicial em tema grafite/roxo, adaptada para celular.
- Identidade e estrutura de pastas do aplicativo.
- GitHub Actions para compilar um APK de debug automaticamente.
- Esqueleto opcional de backend Node.js + SQLite, separado do APK.

## O que ainda NÃO está implementado
Cadastro real, confirmação por e-mail, login, servidores persistentes, chat em tempo real, chamadas, vídeo e compartilhamento de tela. Esses módulos precisam ser desenvolvidos e testados nas próximas etapas. Não há botões que finjam executar essas funções.

## Gerar APK
1. Envie o conteúdo deste projeto para a branch `main` do repositório `cagocagao3-hub/Veyronix-App`.
2. Abra a aba **Actions** no GitHub.
3. Execute **Build Veyronix APK** (ou aguarde o build automático após o push).
4. Baixe o artifact `veyronix-debug-apk`.

## Backend SQLite (esqueleto)
A pasta `backend/` é um serviço separado. O SQLite fica no servidor, nunca dentro do APK compartilhado entre aparelhos. Antes de publicar, configure HTTPS, SMTP e segredos no ambiente de hospedagem.
