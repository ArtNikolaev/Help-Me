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

class CharityEventFragment : Fragment() {

    private lateinit var charityEventViewModel: CharityEventViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        charityEventViewModel =
            ViewModelProviders.of(this).get(CharityEventViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_charity_events, container, false)
        val textView: TextView = root.findViewById(R.id.text_charity_event)
        charityEventViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
