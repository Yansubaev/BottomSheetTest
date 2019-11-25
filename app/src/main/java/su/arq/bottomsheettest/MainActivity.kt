package su.arq.bottomsheettest

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    private lateinit var llBottomSheet: LinearLayout
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<*>
    private lateinit var hideButton: Button
    private lateinit var hideShowButton: FloatingActionButton

    private var bottomSheetHiden = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llBottomSheet = findViewById(R.id.bottom_sheet)
        bottomSheetBehavior = BottomSheetBehavior.from(llBottomSheet)
        hideButton = findViewById(R.id.hide_button)
        hideShowButton = findViewById(R.id.btn_action_hide_show_sheet)

        hideButton.setOnClickListener {
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            bottomSheetHiden = false
        }
        hideShowButton.setOnClickListener {
            if(bottomSheetHiden){
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                bottomSheetHiden = false
            }else{
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_HIDDEN
                bottomSheetHiden = true
            }
        }
    }


}
