import com.example.codingassesment_eveniontechnologies.model.Animals

class Repository {

        companion object {
            fun getAnimalList() : ArrayList<Animals> {
                val animalListData = ArrayList<Animals> ()
                animalListData.add(Animals("https://freepngimg.com/thumb/tiger/2-tiger-png-image-download-tigers-thumb.png",
                        "Tiger1", "A Tiger is a powerful carnivore and a hunter"))

                animalListData.add(Animals("https://pngimg.com/uploads/lion/lion_PNG23258.png",
                        "Lion1", "A Lion is a powerful carnivore "))

                animalListData.add(Animals("https://www.pngkey.com/png/detail/13-139111_elephant-trunk-elephant-png-transparent-background.png",
                        "Elephant", "Elephant is huge "))

                animalListData.add(Animals("https://freepngimg.com/thumb/tiger/2-tiger-png-image-download-tigers-thumb.png",
                        "Tiger2", "Tiger is Hunter "))

                animalListData.add(Animals("https://pngimg.com/uploads/lion/lion_PNG23258.png",
                        "Lion2", "A Lion is a powerful hunter "))


                return animalListData
            }

    }

}