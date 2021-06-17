package gay.kays.scientifichoroscopes.ui.daily

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DailyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Scorpio, you have made a grave mistake coming here."
    }
    val text: LiveData<String> = _text
}