import java.awt.Color

class Watch(brand: BrandName, model: String, color: String, material: String) :
    ElectronicDevices(brand, model, color) {

    override fun info() {
        println("This watch is $brand")
    }

}