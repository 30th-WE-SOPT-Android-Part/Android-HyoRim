package org.sopt.android_hyorim_30th.ui.signin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignInViewModel : ViewModel() {
    val userId = MutableLiveData("")
    val userPw = MutableLiveData("")
    val isSaveId = MutableLiveData(false)

    fun toggleSaveId() {
        isSaveId.postValue(!(isSaveId.value ?: throw IllegalStateException()))
    }

    val isInputComplete
        get() = !userId.value.isNullOrBlank() && !userPw.value.isNullOrBlank()
}
