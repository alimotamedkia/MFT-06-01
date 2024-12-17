class LapTop( brand: BrandName,  storage: StorageType,  model: String,  color: String) : ElectronicDevices(brand,model,color) {
    var shop: String? = null
    var opSystem: String? = null
    private val basePrice=10000
    private val optionPrice =12000

    override var monitor: String="Show"

     fun print() {
        print("$brand is printing")
    }

    fun scan() {
        print("$brand is Scanning")
    }
    fun calculatePrice(): Int {

        return basePrice+optionPrice
    }
}