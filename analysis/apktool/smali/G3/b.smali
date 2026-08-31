.class public final LG3/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LG3/b;->a:I

    iput-object p2, p0, LG3/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO3/C0;LO3/v;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LG3/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG3/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LG3/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG3/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LO3/C0;

    .line 9
    .line 10
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 11
    .line 12
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 16
    .line 17
    iget-object v0, v0, LO3/T1;->x:LO3/b0;

    .line 18
    .line 19
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, LO3/D0;->o()V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "Unexpected call on client side"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :pswitch_0
    iget-object v0, p0, LG3/b;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, LO3/l0;

    .line 36
    .line 37
    new-instance v1, Lcom/google/android/gms/internal/measurement/R1;

    .line 38
    .line 39
    iget-object v0, v0, LO3/l0;->B:Lk3/d;

    .line 40
    .line 41
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/R1;-><init>(Lk3/d;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :pswitch_1
    iget-object v0, p0, LG3/b;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Landroid/content/Context;

    .line 48
    .line 49
    const-string v1, "google_sdk_flags"

    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
