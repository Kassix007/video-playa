.class public final LO3/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LO3/C0;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LO3/u0;->a:I

    iput-object p2, p0, LO3/u0;->c:Ljava/lang/Object;

    iput-object p1, p0, LO3/u0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO3/T1;LO3/a2;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LO3/u0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LO3/u0;->c:Ljava/lang/Object;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, LO3/u0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LO3/u0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LO3/u0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LO3/a2;

    .line 9
    .line 10
    iget-object v1, v0, LO3/a2;->q:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v1}, Lx3/A;->g(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, LO3/u0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, LO3/T1;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, LO3/T1;->a(Ljava/lang/String;)LO3/J0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v3, LO3/I0;->s:LO3/I0;

    .line 24
    .line 25
    invoke-virtual {v1, v3}, LO3/J0;->i(LO3/I0;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v0, LO3/a2;->I:Ljava/lang/String;

    .line 32
    .line 33
    const/16 v4, 0x64

    .line 34
    .line 35
    invoke-static {v4, v1}, LO3/J0;->c(ILjava/lang/String;)LO3/J0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1, v3}, LO3/J0;->i(LO3/I0;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {v2, v0}, LO3/T1;->a0(LO3/a2;)LO3/c0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, LO3/c0;->E()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    invoke-virtual {v2}, LO3/T1;->b()LO3/X;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, LO3/X;->E:LO3/V;

    .line 60
    .line 61
    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, LO3/V;->b(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 v0, 0x0

    .line 67
    :goto_1
    return-object v0

    .line 68
    :pswitch_0
    iget-object v0, p0, LO3/u0;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, LO3/C0;

    .line 71
    .line 72
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 73
    .line 74
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, LO3/u0;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v1, LO3/a2;

    .line 80
    .line 81
    new-instance v2, LO3/i;

    .line 82
    .line 83
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 84
    .line 85
    iget-object v1, v1, LO3/a2;->q:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, LO3/T1;->o0(Ljava/lang/String;)Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-direct {v2, v0}, LO3/i;-><init>(Landroid/os/Bundle;)V

    .line 92
    .line 93
    .line 94
    return-object v2

    .line 95
    :pswitch_1
    iget-object v0, p0, LO3/u0;->b:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, LO3/C0;

    .line 98
    .line 99
    iget-object v1, v0, LO3/C0;->c:LO3/T1;

    .line 100
    .line 101
    invoke-virtual {v1}, LO3/T1;->A()V

    .line 102
    .line 103
    .line 104
    iget-object v0, v0, LO3/C0;->c:LO3/T1;

    .line 105
    .line 106
    iget-object v0, v0, LO3/T1;->s:LO3/n;

    .line 107
    .line 108
    invoke-static {v0}, LO3/T1;->S(LO3/O1;)V

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, LO3/u0;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v0, v1}, LO3/n;->l0(Ljava/lang/String;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
