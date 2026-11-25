# Veyronix Backend — foundation

Este serviço é separado do APK e prepara o SQLite central para uso futuro pelo Android e pelo site.

## Rodar no Termux
```bash
cd backend
cp .env.example .env
npm install
npm start
```

Teste: `http://127.0.0.1:3000/health`

## Segurança
Este é apenas um esqueleto de API. Ainda não possui cadastro/login, hash de senha, confirmação por e-mail, autorização, rate limiting ou endpoints de servidores/mensagens. Não exponha publicamente antes de implementar esses controles e HTTPS.
