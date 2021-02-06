package com.example.my_first_and_app.domain.monsters

class Monster
private constructor(builder: Monster.Builder)
//(
//        val name: String,
//        val hp: Int,
//        val attack: Int,
//        val deffence: Int,
//        val spAttack: Int,
//        val spDeffence: Int,
//        val speed: Int,
//        val isLegend: Boolean,
//        val isSemiLegend: Boolean,
//        val isUltraBeast: Boolean
//)
{
//  class Builder {
//      var name: String? = null
//        private set
//      var hp: Int = 0
//        private set
//      var attack: Int = 0
//        private set
//      var deffence: Int = 0
//        private set
//      var spAttack: Int = 0
//        private set
//      var spDeffence: Int = 0
//        private set
//      var speed: Int = 0
//        private set
//      var isLegend: Boolean = false
//        private set
//      var isSemiLegend: Boolean = false
//        private set
//      var isUltraBeast: Boolean = false
//        private set

    data class Builder(
            var name: String? = null,
            var hp: Int = 0,
            var attack: Int = 0,
            var deffence: Int = 0,
            var spAttack: Int = 0,
            var spDeffence: Int = 0,
            var speed: Int = 0,
            var isLegend: Boolean = false,
            var isSemiLegend: Boolean = false,
            var isUltraBeast: Boolean = false
    ) {
      fun name(name: String) = apply { this.name = name }
      fun hp(hp: Int) = apply { this.hp = hp }
      fun attack(attack: Int) = apply { this.attack = attack }
      fun deffence(deffence: Int) = apply { this.deffence = deffence }
      fun spAttack(spAttack: Int) = apply { this.spAttack = spAttack }
      fun spDeffence(spDeffence: Int) = apply { this.spDeffence = spDeffence }
      fun speed(speed: Int) = apply { this.speed = speed }
      fun isLegend(isLegend: Boolean) = apply { this.isLegend = isLegend}
      fun isSemiLegend(isSemiLegend: Boolean) = apply { this.isSemiLegend = isSemiLegend }
      fun isUltraBeast(isUltraBeast: Boolean) = apply { this.isUltraBeast = isUltraBeast }

        fun status(status: Status) = apply {
            this.hp = status.hp
            this.attack = status.attack
            this.deffence = status.deffence
            this.spAttack = status.spAttack
            this.spDeffence = status.spDeffence
            this.speed = status.speed
        }
      fun build(): Monster = Monster(this)
  }

    data class Status(val hp: Int, val attack: Int, val deffence: Int, val spAttack: Int, val spDeffence: Int, val speed: Int)
}