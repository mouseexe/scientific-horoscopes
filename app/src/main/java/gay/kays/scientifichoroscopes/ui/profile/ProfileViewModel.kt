package gay.kays.scientifichoroscopes.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "You can change your scientific profile here."
    }
    val text: LiveData<String> = _text
}