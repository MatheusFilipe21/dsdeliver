# DS Delivery
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MatheusFilipe21/dsdeliver/blob/main/LICENSE)

# Sobre o projeto
DS Delivery é uma aplicação Full Stack, WEB e Mobile construída durante a 2ª edição da **Semana DevSuperior**, evento organizado pela <a href="https://devsuperior.com.br" target="_blank" title="DevSuperior">DevSuperior</a>.

A aplicação consiste em um sistemas de pedidos onde a aplicação WEB é responsável por cadastrar os pedidos e a aplicação Mobile faz a listagem dos pedidos e permite confirmar a entrega dos mesmos.

#### Front-end
<a href="https://matheusfilipe21-dsdeliver.netlify.app" target="_blank" title="Front-end">https://matheusfilipe21-dsdeliver.netlify.app</a>
#### Back-end
<a href="https://matheusfilipe21-dsdeliver.herokuapp.com" target="_blank" title="Back-end">https://matheusfilipe21-dsdeliver.herokuapp.com</a>

- Endpoints
  - [GET] /products
  - [GET] /orders
  - [POST] /orders
  - [PUT] /orders/{id}/delivered

## Layout Mobile
![Mobile 1](https://user-images.githubusercontent.com/57512945/104141964-0f31fa00-5398-11eb-848e-c20d24440642.png)   ![Mobile 2](https://user-images.githubusercontent.com/57512945/104141962-0e00cd00-5398-11eb-8d67-87597b75cba5.png) ![Mobile 3](https://user-images.githubusercontent.com/57512945/104141963-0f31fa00-5398-11eb-850d-e63871d43054.png)

## Layout WEB
![WEB 1](https://user-images.githubusercontent.com/57512945/104141913-d2660300-5397-11eb-8566-6c585be1dee3.png)

![WEB 2](https://user-images.githubusercontent.com/57512945/104141932-ef023b00-5397-11eb-84db-cc896acea081.png)

## Modelo conceitual
![Modelo Conceitual](https://user-images.githubusercontent.com/57512945/104142056-92ebe680-5398-11eb-8b3f-02f170ebd94c.png)

# Tecnologias utilizadas

## Back-end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Front-end
- HTML / CSS / JS / TypeScript
- ReactJS
- React Native
- Expo

## Implantação em produção
- Back-end: Heroku
- Front-end WEB: Netlify
- Banco de dados: PostgreSQL

# Como executar o projeto

## Back-end
Pré-requisitos: <a href="https://www.oracle.com/br/java/technologies/javase-jdk11-downloads.html" target="_blank" title="Java 11">Java 11</a>, <a href="https://maven.apache.org/download.cgi" target="_blank" title="Como instalar o Maven no Windows">Maven</a>

```bash
# Clonar o repositório
git clone https://github.com/MatheusFilipe21/dsdeliver.git

# Acessar a pasta do back-end do projeto
cd dsdeliver/backend

# Executar o projeto utilizando o Maven
mvn spring-boot:run
```

## Front-end WEB
Pré-requisitos: <a href="https://www.npmjs.com/get-npm" target="_blank" title="npm">npm</a> ou <a href="https://classic.yarnpkg.com/en/docs/install" target="_blank" title="yarn">yarn</a>

```bash
# Clonar o repositório
git clone https://github.com/MatheusFilipe21/dsdeliver.git

# Entrar na pasta do projeto front-end WEB
cd dsdeliver/front-web

#Crie uma conta no Mapbox, na página inicial aparece sua chave de acesso (Default public token), copie essa chave e apague SUA_CHAVE_DO_MAPBOX e cole a sua chave
#Se você estiver com o back-end rodando em sua máquina, substitua https://matheusfilipe21-dsdeliver.herokuapp.com por http://localhost:8080

# Criar um arquivo com o nome .env
cat > .env
# Cole as linhas a seguir com as alterações feitas
REACT_APP_ACCESS_TOKEN_MAP_BOX=SUA_CHAVE_DO_MAPBOX
REACT_APP_API_URL=https://matheusfilipe21-dsdeliver.herokuapp.com
#Aperte a tecla enter
# Pressione Ctrl + z simultaneamente para salvar o arquivo

# Instalar as dependências
npm install ou yarn install

# Executar o projeto
npm start ou yarn start
```
## Front-end Mobile
Pré-requisitos: <a href="https://www.npmjs.com/get-npm" target="_blank" title="npm">npm</a> ou <a href="https://classic.yarnpkg.com/en/docs/install" target="_blank" title="yarn">yarn</a>, smartphone com o app do Expo <a href="https://play.google.com/store/apps/details?id=host.exp.exponent&hl=pt_BR&gl=US" target="_blank" title="Expo Google Play Store">Android</a> ou <a href="https://apps.apple.com/br/app/expo-client/id982107779" target="_blank" title="Expo App Store">iOS</a>

```bash
# Clonar o repositório
git clone https://github.com/MatheusFilipe21/dsdeliver.git

# Acessar a pasta do front-end Mobile do projeto
cd dsdeliver/front-mobile

# Instalar as dependências
npm install ou yarn install

# Instalar o Axios (Responsável pelas requisições)
npm install axios ou yarn add axios

# Instalar o Intl (Nesse app usado para formatar os valores)
npm install react-intl-universal --save ou yarn add react-intl-universal

# Instalar o Expo (Utilizado para rodar o aplicativo no smartphone)
npm install --global expo-cli ou yarn global add expo-cli

# Executar o projeto
npm start ou yarn start

# Com o servidor rodando, no Android (com o aplicativo Expo baixado) abra o aplicativo e leia o QR Code, já  no iOS (com o aplicativo Expo baixado) abra a câmera e leia o QR Code, quando a leitura for feita clique em abrir com Expo
```

### Autor
---

 <img style="border-radius: 50%;" src="https://avatars3.githubusercontent.com/u/57512945?s=400&u=59280288c5d415b3aedca01cbb06db3c600740a8&v=4" width="100px;" alt=""/>

#### Matheus Pereira

<a href="https://www.linkedin.com/in/matheusfilipe21" target="_blank" title="Linkedin Matheus Pereira"><img src="https://img.shields.io/badge/-Matheus Pereira-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/matheusfilipe21" alt="Linkedin Matheus Pereira"/></a> [![Gmail Matheus Pereira](https://img.shields.io/badge/-matheusfilipe1999@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:matheusfilipe1999@gmail.com)](mailto:matheusfilipe1999@gmail.com "Gmail Matheus Pereira")