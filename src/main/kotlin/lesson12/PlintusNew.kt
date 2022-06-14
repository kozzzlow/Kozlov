    fun main() {
        // длины стен по комнатам в сантиметрах
        val gostinaya = listOf(86, 160, 426, 270, 77, 33)
        val koridor =
            listOf(51, 20, 123, 290, 16, 466, 30, 16, 16, 65, 90, 62, 9, 200, 63, 130, 79, 4)
        val spalnia = listOf(22, 12, 157, 355, 277, 346, 4)
        val kabinet = listOf(290, 205, 14, 18, 53, 71, 74, 70, 70, 123, 167)
        val garderob = listOf(8, 8, 116, 147, 44, 66, 61)
        val detskaya = listOf(363, 6, 126, 55, 154, 402, 280)

        val perimetr1 = calculatePerimetr(gostinaya)
        println("Perimetr gostinaya - $perimetr1 metrov")
        val perimetr2 = calculatePerimetr(koridor)
        println("Perimetr koridor - $perimetr2 metrov")
        val perimetr3 = calculatePerimetr(spalnia)
        println("Perimetr spalnia - $perimetr3 metrov")
        val perimetr4 = calculatePerimetr(kabinet)
        println("Perimetr kabinet - $perimetr4 metrov")
        val perimetr5 = calculatePerimetr(garderob)
        println("Perimetr garderob - $perimetr5 metrov")
        val perimetr6 = calculatePerimetr(detskaya)
        println("Perimetr detskaya - $perimetr6 metrov")

        val collec = listOf(perimetr1, perimetr2, perimetr3, perimetr4, perimetr5, perimetr6)

        val izdelia = calculateMetrInIzd(collec)
        println("Kollichestvo izdelii po komnatam = $izdelia")

        val kolIzdel = calculateCountIzd(izdelia)
        println("Tochnoe kolichestvo palok plintusa $kolIzdel")
        println("Okruglennoe kolichestvo palok plintusa ${Math.round(kolIzdel)}")
    }

    private fun calculatePerimetr(komnata: List<Int>): Double {
        var sum = 0.0
        komnata.forEach {
            sum += it
        }
        return sum / 100
    }

    private fun calculateMetrInIzd(perimCollec: List<Double>): List<Double> {
        val newList = mutableListOf<Double>()
        perimCollec.forEach {
            newList.add(it / 2.5) // 2.5 м - длина одной палки плинтуса
        }
        return newList
    }

    private fun calculateCountIzd(summa: List<Double>): Double {
        var sum = 0.0
        summa.forEach {
            sum += it
        }
        return sum
    }
