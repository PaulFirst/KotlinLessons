open class Animal
{
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise()
    {
        println("The Animal is making a noise")
    }

    open fun eat()
    {
        println("The Animal is eating")
    }

    open fun roam()
    {
        println("The Animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }
}

class Hippo: Animal()
{
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise()
    {
        println("Grunt! Grunt!")
    }
}

open class Canine: Animal()
{
    override fun roam()
    {
        println("The Canine is roaming")
    }
}

class Wolf: Canine()
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