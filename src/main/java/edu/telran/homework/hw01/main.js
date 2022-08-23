const findSingle = intArr => {

    for (let i = 0; i < intArr.length - 2; i += 2) {
        if (intArr[i] !== intArr[i + 1]) {
            return intArr[i]
        }
    }

    return intArr[intArr.length - 1]
}

const arr01 = [1, 1, 2, 2, 3, 4, 4, 5, 5] // 3 at the middle of array
const arr02 = [1, 2, 2, 3, 3, 4, 4, 5, 5] // 1 at the start of array
const arr03 = [1, 1, 2, 2, 3, 3, 4, 4, 5] // 5 at the end of array

console.log(findSingle(arr01))
console.log(findSingle(arr02))
console.log(findSingle(arr03))

