#  Wishlist Manager - Backlog
Barai is a solution for anyone filled up with backlogs, unnorganized piles of desired content or activities. 

### Features: 
 - Wishlist, 
 - Backlog list, 
 - On-going list, 
 - On-Hold list, 
 - Gave-up List, 
 - Reviews by platform played, 
 - Archievements and progression bar taken from the player's platform account 
 
 ---
 
 ### Research list:
 #### Inspirations
 - [My Anime List](https://myanimelist.net/) - Inspiration #1
 - [My Anime List API](https://myanimelist.net/apiconfig/references/api/v2)
 - [GameFaqs](https://gamefaqs.gamespot.com/) - Inspiration #2
 - [Letterbox](https://letterboxd.com) - Inspiration #3
 - [iMDB](https://imbd.com) - Inspiration #4
 
 #### APIs to use:
  - [TGDB](https://thegamesdb.net/) - Video Games DB API
  - [?](https://) - Films and TV series API
  - [?](https://) - Books API

---

## Install Guide
### Requirements:
- Docker 17.04.0+
- Docker Compose 3.2+

1. Build Docker containers: ``docker compose build``
2. Start Docker containers: ``docker compose up -d``
#### <span style="color:red"> Warning </span>
- If you want to run the Next.js **LOCALLY** and also wants to use Docker, you may step into the following error:

        yarn run v1.22.19
        $ next dev
        - ready started server on [::]:3000, url: http://localhost:3000
        [Error: EACCES: permission denied, unlink '/path/to/project/barai-backlog/front/.next/server/app-paths-manifest.json'] {
        errno: -13,
        code: 'EACCES',
        syscall: 'unlink',
        path: '/path/to/project/barai-backlog/front/.next/server/app-paths-manifest.json'
        }

- If so, run the following code at the project's **root**: ``sudo chmod 777 -R front/.next``



