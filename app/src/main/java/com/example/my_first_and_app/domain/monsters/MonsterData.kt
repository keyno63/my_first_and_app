package com.example.my_first_and_app.domain.monsters

import com.example.my_first_and_app.domain.monsters.Monster.Builder
import com.example.my_first_and_app.domain.monsters.Monster.Status

class MonsterData {

    val ミュウツー: Monster = //Monster("ミュウツー", 106, 110, 90, 154, 90, 130, true, false, false)
            Builder()
            .name("ミュウツー")
//                    .hp(106)
//                    .attack(110)
//                    .deffence(90)
//                    .spAttack(154)
//                    .spDeffence(90)
//                    .speed(130)
                    .status(Status(106, 110, 90, 154, 90, 130))
                    .isLegend(true)
                    .isSemiLegend(false)
                    .isUltraBeast(false)
                    .build()
    val ルギア: Monster = Builder()
            .name("ルギア")
            .status(Status(106, 90, 130, 90, 154, 110))
            .isLegend(true)
            .isSemiLegend(false)
            .isUltraBeast(false)

            .build()
}