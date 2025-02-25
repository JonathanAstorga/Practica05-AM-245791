package astorga.jonathan.practica05_245791

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        agregarProductos()
    }

    fun  agregarProductos(){
        //tacos
        menu.add(Product("Taco Tradicional", R.drawable.taco, "Traditional Taco", 2.79))

        //antojitos
        menu.add(Product("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada - Filled" +
                " with your choice of meat, served with salad", 5.99))
        menu.add(Product("Huaraches", R.drawable.huaraches, "Tortilla gruesa con frijoles, " +
                "tu carne favorita, lechuga, queso fresco y crema - " +
                "Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream. ", 10.99))
        menu.add(Product("Gringas", R.drawable.gringas, "Tortilla de harina con queso, carne al pastor y piña - " +
                "Flour tortilla filled with cheese, marinated pork and pineapple.", 7.99))
        menu.add(Product("Sincronizada", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamón. " +
                "Acompañada de lechuga, crema y guacamole - Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, " +
                "and guacamole.", 7.99))
        menu.add(Product("Sopes", R.drawable.sopes, "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso " +
                "fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, and sour cream.", 3.79))

        //especialidades
        menu.add(Product("Mojarra Frita - Fried Fish", R.drawable.mojarra, "Tilapia frita servida con lechuga, cebolla, " +
                "jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.", 17.99))
        menu.add(Product("Ceviche", R.drawable.ceviche, "Tilapia, camarones, Aguacate y pico de gallo servido con Chips " +
                "/ Tilapia, Shrimp, Avocado and pico de gallo, served with Chips", 6.99))
        menu.add(Product("Botana de Camarones al Mojo de Ajo", R.drawable.botanacamarones, "", 19.99))
        menu.add(Product("Botana de Camarones a la Diabla", R.drawable.botanacamarones, "", 19.99))
        menu.add(Product("Torre de Camarón Negro", R.drawable.botanacamarones, "", 16.99))
        menu.add(Product("Botana de Pulpo a la Diabla", R.drawable.ceviche, "Servido totopos, cebolla frita, arroz, " +
                "lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.", 24.99))
        menu.add(Product("Botana de Pulpo al Mojo de Ajo", R.drawable.ceviche, "Servido totopos, cebolla frita, arroz, " +
                "lechuga y pico de gallo - Served with chips, grill onions, rice, lettuce and pico de gallo.", 24.99))
        menu.add(Product("Pulpo al Mojo de Ajo", R.drawable.ceviche, "", 35.00))
        menu.add(Product("Pulpo Zarandeado", R.drawable.ceviche, "", 35.00))
        menu.add(Product("Platillos de Camarón al Mojo de Ajo", R.drawable.botanacamarones, "", 18.99))
        menu.add(Product("Platillos de Camarón a la Diabla", R.drawable.botanacamarones, "", 18.99))

        //combos

    }


}