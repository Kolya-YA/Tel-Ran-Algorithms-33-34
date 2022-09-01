# Tel-Ran — 33-34M

## Algorithms @ 30.08.2022
recjqFTcTbt8mKwhr

### Tasks
> - **First level:** [Link](https://docs.google.com/presentation/d/1YSsj-rNV6qIiJvpL0bydAqxs5BGknFdh/edit?usp=sharing&ouid=101468105264840729823&rtpof=true&sd=true)
> - **Second level:** Запрограммировать модифицированный алгоритм евклида

### Solutions

#### First level
**Task 1**
```
void test1(int n)
{
    if (n==1) 
       return;
    for (int i=1; i<=n; i++)
        for (int j=1; j<=n; j++)
            System.out.println("*");
            break;
}
 ```
Time complexity: **O(*n*)**

**Task 2**
```
void test2(int n)
{
    int a = 0;
    for (i = 0; i < n; i++)
        for (j = n; j > i; j--)
            a = a + i + j;    
}
```
Time complexity: **O(*n<sup>2</sup>*)**

**Task 3**
```
void test3(int n)
{
    int i, j, a = 0;
    for (i = n / 2; i <= n; i++)
        for (j = 2; j <=n; j = j * 2)
            a = a + n / 2;    
}
```
Time complexity: **O(*n<sup>2</sup>*)**

**Task 4**
```
void test4(int n)
{
    int a = 0, i = n;
    while (i > 0) {
        a += i;
        i /= 2;
    }
}
```
Time complexity: **O(log *n*)**

#### First level

**Java** version in file *main.java*