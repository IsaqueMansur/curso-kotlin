package model

import enums.EnumsInvitesType
import enums.EnumValidateInfo
import enums.EnumsInvitesCod

class Console {
    fun validateAge(age: String): EnumValidateInfo {
        var currentAge: Int = 0
        try {
            currentAge = age.toInt()
        } catch (e: Exception) {
            println("Não autorizado (valor inválido).")
            println("\r\nReiniciando ciclo...")
            return EnumValidateInfo.INVALID_VALUE
        }
        if (currentAge > 17) return EnumValidateInfo.AUTHORIZED
        println("Não autorizado (menor de idade).")
        return EnumValidateInfo.NOT_AUTHORIZED
    }

    fun validadeInvite(inviteCod: String): EnumValidateInfo {
        if (inviteCod.length < 2) {
            println("Não autorizado (valor inválido).")
            println("\r\nReiniciando ciclo...")
            return EnumValidateInfo.INVALID_VALUE
        }
        val typeInvite = inviteCod.substring(0, 2)
        try {
            val inviteType = EnumsInvitesType.entries.find { it.startCod == EnumsInvitesCod.valueOf(typeInvite) }
            println("Autorizado ($inviteType)")
            return EnumValidateInfo.AUTHORIZED
        } catch (e: Exception) {
            println("Não autorizado (convite não reconhecido)")
            return EnumValidateInfo.NOT_AUTHORIZED
        }
    }

    fun readAge(): String {
        println("\r\nDigite a idade: ")
        val informedAge = readlnOrNull()
        return informedAge!!
    }

    fun readCodInvite(): String {
        println("\r\nDigite o código do convite: ")
        val informedCodInvite = readlnOrNull()
        return informedCodInvite!!
    }

}