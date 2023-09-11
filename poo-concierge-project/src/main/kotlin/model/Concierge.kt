package model

import enums.EnumValidateInfo

class Concierge {
    private val console = Console()
    init {
        inviteVerification()
    }
    private fun inviteVerification() {
        var age: String
        var inviteCod: String

        do {
            age = console.readAge()
        } while (console.validateAge(age) === EnumValidateInfo.INVALID_VALUE)

        if (age.toInt() > 17) {
            do {
                inviteCod = console.readCodInvite()
            } while (console.validadeInvite(inviteCod) === EnumValidateInfo.INVALID_VALUE)
        }
    }
}
