package gay.kays.scientifichoroscopes.ui.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Your horoscopes from previous days will appear here."
    }
    val text: LiveData<String> = _text
}