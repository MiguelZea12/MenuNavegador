package com.example.navigatorapp.recyclerEcPlayers

import com.example.navigatorapp.recyclerEcPlayers.EcPlayer

class EcPlayersProvider {
    companion object {
        val ecPlayersList = listOf<EcPlayer>(
            EcPlayer(
                "Messi",
                "Delantero",
                "PSG", 37,
                30,
                "https://upload.wikimedia.org/wikipedia/commons/c/c1/Lionel_Messi_20180626.jpg"
            ),
            EcPlayer(
                "Piero Hincapie",
                "Defensa",
                "Bayer 04 Leverkusen",
                20,
                3,
                "https://pbs.twimg.com/media/FVTTqhsWIAY1HLd?format=jpg&name=900x900"
            ),
            EcPlayer(
                "Cristiano Ronaldo",
                "Delantero",
                "Manchester United",
                38,
                7,
                "https://upload.wikimedia.org/wikipedia/commons/8/8c/Cristiano_Ronaldo_2018.jpg"
            ),
            EcPlayer(
                "Gonzalo Plata",
                "Delantero",
                "Valladolid",
                22,
                19,
                "https://www.eluniverso.com/resizer/fmll1GR51elinyPUG3QYWdh5Nd4=/0x0:1024x724/948x670/filters:quality(70)/cloudfront-us-east-1.images.arcpublishing.com/eluniverso/56PGPWEDR5GNRNJ7NMX3JSQK2Q.jpg"
            ),
            EcPlayer(
                "Zlatan ibrahimovic",
                "Delantero",
                "Milan",
                41,
                21,
                "https://upload.wikimedia.org/wikipedia/commons/0/09/Zlatan_Ibrahimovi%C4%87_June_2018.jpg"
            ),
            EcPlayer(
                "Moises Caicedo",
                "Mediocampista",
                "Brighton",
                21,
                23,
                "https://i2-prod.football.london/incoming/article25131606.ece/ALTERNATES/s1200c/0_GettyImages-1243558036.jpg"
            ),
            EcPlayer(
                "Neymar",
                "Delandtero",
                "PSG",
                34,
                10,
                "https://upload.wikimedia.org/wikipedia/commons/8/83/Bra-Cos_%281%29_%28cropped%29.jpg"
            ),

        )
    }
}