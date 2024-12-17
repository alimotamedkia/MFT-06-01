fun main() {

    val asus = LapTop(brand = BrandName.ASUS, model = "N552W", storage = StorageType.SSD, color = "silver")
    asus.shop = "Iran Shop"
    asus.info()

    val Acer = LapTop(brand = BrandName.ACER, model = "552W", storage = StorageType.HDD, color = "blue")
    val hp = LapTop(brand = BrandName.HP, model = "L895S", storage = StorageType.HDD, color = "black")

    val  listOfLaptop = listOf(asus,Acer,hp)

    val Samsung = Watch(brand = BrandName.Samsung, model = "band", color = "black", material = "Plastic")
    Samsung.info()

    println(Acer.calculatePrice())



}