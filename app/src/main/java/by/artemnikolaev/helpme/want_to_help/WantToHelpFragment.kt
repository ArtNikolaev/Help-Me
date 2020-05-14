package by.artemnikolaev.helpme.ui.message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import by.artemnikolaev.helpme.R

class WantToHelpFragment : Fragment() {

    private lateinit var wantToHelpViewModel: WantToHelpViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        wantToHelpViewModel =
            ViewModelProviders.of(this).get(WantToHelpViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_want_to_help, container, false)
        val textView: TextView = root.findViewById(R.id.text__want_to_help)
        wantToHelpViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
