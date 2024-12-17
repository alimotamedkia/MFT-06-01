open class ElectronicDevices(val brand: BrandName, val model: String, val color: String) {

    open fun info() {
        print("This Laptop is $brand\n Model: $model\n Color: $color\n")
    }

    open var monitor: String = null

}