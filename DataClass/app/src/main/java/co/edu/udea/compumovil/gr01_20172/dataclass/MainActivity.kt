package co.edu.udea.compumovil.gr01_20172.dataclass

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var person: DataClassPerson = DataClassPerson("","","")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savebn.setOnClickListener({
            view -> save()
        })

        showbn.setOnClickListener({
            view -> show()
        })
    }

    fun save()
    {

        var name= namete.text.toString()
        var surname = surnamete.text.toString()
        var id = idte.text.toString()

        var person: DataClassPerson = DataClassPerson(name,surname,id)
        this.person = person
    }

    fun show()
    {
        nametv.text = person.name
        surnametv.text = person.surname
        idtv.text = person.id
    }

}