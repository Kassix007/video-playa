.class public abstract LP/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LP/Q;


# direct methods
.method public constructor <init>(LB5/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP/Q;

    .line 5
    .line 6
    invoke-direct {v0, p1}, LP/Q;-><init>(LB5/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LP/l0;->a:LP/Q;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)LP/m0;
.end method

.method public b()LP/V0;
    .locals 1

    .line 1
    iget-object v0, p0, LP/l0;->a:LP/Q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LP/m0;LP/V0;)LP/V0;
    .locals 3

    .line 1
    instance-of v0, p2, LP/G;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p1, LP/m0;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    move-object v1, p2

    .line 11
    check-cast v1, LP/G;

    .line 12
    .line 13
    iget-object p2, v1, LP/G;->a:LP/f0;

    .line 14
    .line 15
    invoke-virtual {p1}, LP/m0;->a()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    instance-of v0, p2, LP/U0;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-boolean v0, p1, LP/m0;->b:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p1, LP/m0;->e:Ljava/lang/Object;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    :cond_1
    iget-boolean v0, p1, LP/m0;->d:Z

    .line 36
    .line 37
    if-nez v0, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, LP/m0;->a()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast p2, LP/U0;

    .line 44
    .line 45
    iget-object v2, p2, LP/U0;->a:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    move-object v1, p2

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of v0, p2, LP/A;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    check-cast p2, LP/A;

    .line 63
    .line 64
    iget-object p2, p2, LP/A;->a:Lkotlin/jvm/internal/n;

    .line 65
    .line 66
    :cond_3
    :goto_0
    if-nez v1, :cond_6

    .line 67
    .line 68
    iget-boolean p2, p1, LP/m0;->d:Z

    .line 69
    .line 70
    if-eqz p2, :cond_5

    .line 71
    .line 72
    new-instance p2, LP/G;

    .line 73
    .line 74
    iget-object v0, p1, LP/m0;->e:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object p1, p1, LP/m0;->c:LP/I0;

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    sget-object p1, LP/S;->v:LP/S;

    .line 81
    .line 82
    :cond_4
    new-instance v1, LP/f0;

    .line 83
    .line 84
    invoke-direct {v1, v0, p1}, LP/f0;-><init>(Ljava/lang/Object;LP/I0;)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, v1}, LP/G;-><init>(LP/f0;)V

    .line 88
    .line 89
    .line 90
    return-object p2

    .line 91
    :cond_5
    new-instance p2, LP/U0;

    .line 92
    .line 93
    invoke-virtual {p1}, LP/m0;->a()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-direct {p2, p1}, LP/U0;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object p2

    .line 101
    :cond_6
    return-object v1
.end method
