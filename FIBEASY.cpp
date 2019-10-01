#include<iostream>
#include<math.h>
using namespace std;
#define ll long long
ll f[60] = {0};
void fib(ll size)
{
    f[0] = 0; 
    f[1] = 1;
    for (ll i = 2; i <= size; i++) 
        f[i] = (f[i - 1] + f[i - 2]) % 10;
} 
int main()
{
    ll T;
    cin>>T;
    fib(100);
    while(T--)
    {
        ll n, i=0;
        cin>>N;
        ll min=0;
        while(n>0)
        {
            n = n >> 1;
            min++;
        }
        ll req = pow(2, min-1);
        cout<<f[(req-1)%60]<<endl;
    }
    return 0;
}