abstract class Animal
{
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    open fun roam()
    {
        println("The Animal is roaming")
    }

    fun sleep()
    {
        println("The Animal is sleeping")
    }
}

class Hippo: Animal()
{
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

abstract class Canine() : Animal()
{
    override fun roam()
    {
        println("The Canine is roaming")
    }
}

class Wolf : Canine()
{
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("Hoooowl!")
    }

    override fun eat() {
        println("The Wolf is eating $food")
    }
}

class Vet
{
    fun giveShot(animal: Animal)
    {
        animal.makeNoise()
    }
}

fun main() {
    val animals = arrayOf(Hippo(), Wolf())
    for (item in animals)
    {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    vet.giveShot(animals[1])
    vet.giveShot(animals[0])
}