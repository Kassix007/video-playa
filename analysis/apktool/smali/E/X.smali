.class public final LE/X;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LX/e;


# direct methods
.method public constructor <init>(LX/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LE/X;->q:I

    .line 1
    iput-object p1, p0, LE/X;->r:LX/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(LX/e;I)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, LE/X;->q:I

    .line 2
    iput-object p1, p0, LE/X;->r:LX/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LE/X;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, LP/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 p2, p2, 0x3

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, LP/o;->x()Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p1}, LP/o;->N()V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    :goto_0
    sget-object p2, LA/i;->c:LA/b;

    .line 31
    .line 32
    sget-object v0, Lc0/b;->B:Lc0/c;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-static {p2, v0, p1, v1}, LA/r;->a(LA/g;Lc0/c;LP/o;I)LA/t;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget v0, p1, LP/o;->P:I

    .line 40
    .line 41
    invoke-virtual {p1}, LP/o;->m()LP/i0;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Lc0/j;->q:Lc0/j;

    .line 46
    .line 47
    invoke-static {p1, v2}, Lc0/o;->c(LP/o;Lc0/m;)Lc0/m;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v3, LB0/k;->a:LB0/j;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v3, LB0/j;->b:LB0/D;

    .line 57
    .line 58
    invoke-virtual {p1}, LP/o;->W()V

    .line 59
    .line 60
    .line 61
    iget-boolean v4, p1, LP/o;->O:Z

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1, v3}, LP/o;->l(LB5/a;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {p1}, LP/o;->g0()V

    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object v3, LB0/j;->e:LB0/i;

    .line 73
    .line 74
    invoke-static {v3, p1, p2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    sget-object p2, LB0/j;->d:LB0/i;

    .line 78
    .line 79
    invoke-static {p2, p1, v1}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object p2, LB0/j;->f:LB0/i;

    .line 83
    .line 84
    iget-boolean v1, p1, LP/o;->O:Z

    .line 85
    .line 86
    if-nez v1, :cond_3

    .line 87
    .line 88
    invoke-virtual {p1}, LP/o;->H()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_4

    .line 101
    .line 102
    :cond_3
    invoke-static {v0, p1, v0, p2}, Lk1/i;->o(ILP/o;ILB0/i;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    sget-object p2, LB0/j;->c:LB0/i;

    .line 106
    .line 107
    invoke-static {p2, p1, v2}, LP/b;->u(LB5/e;LP/o;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/4 p2, 0x6

    .line 111
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    iget-object v0, p0, LE/X;->r:LX/e;

    .line 116
    .line 117
    sget-object v1, LA/u;->a:LA/u;

    .line 118
    .line 119
    invoke-virtual {v0, v1, p1, p2}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    const/4 p2, 0x1

    .line 123
    invoke-virtual {p1, p2}, LP/o;->p(Z)V

    .line 124
    .line 125
    .line 126
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_0
    check-cast p1, LP/o;

    .line 130
    .line 131
    check-cast p2, Ljava/lang/Number;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 134
    .line 135
    .line 136
    const/4 p2, 0x7

    .line 137
    invoke-static {p2}, LP/b;->w(I)I

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    iget-object v0, p0, LE/X;->r:LX/e;

    .line 142
    .line 143
    invoke-static {v0, p1, p2}, LE/C;->c(LX/e;LP/o;I)V

    .line 144
    .line 145
    .line 146
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 147
    .line 148
    return-object p1

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
