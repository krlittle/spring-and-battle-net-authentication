# SpringAndBlizzard
Using Spring Security to authenticate user credentials through Blizzard's battle.net servers

This app will securely log into battle.net through Blizzard's authentication servers provided you can present valid credentials.

You need to have both a battle.net account as well as a developer accounts for Blizzard to make this application work.

Blizzard's developer portal: https://dev.battle.net/

Missing from this repository is the `application.yml` file which contains the credentials I used to validate my application and credentials with Blizzard's authentication servers.  If you wish to pick this up and use it as your own, you will need to provide an `application.yml` file under the `src/main/resources` directory.

In your `application.yml` file, you will want to provide the following:

```
security:
  oauth2:
    client:
      clientId: <provided to you once you register your application with Blizzard's dev portal>
      clientSecret: <provided to you once you register your application with Blizzard's dev portal>
      accessTokenUri: https://us.battle.net/oauth/token
      userAuthorizationUri: https://us.battle.net/oauth/authorize
    resource:
      userInfoUri: https://us.api.battle.net/wow/user/characters
```
## How to Run
Run `LocalSpringBlizzardApp.java` and open your browser to http://localhost:8080.