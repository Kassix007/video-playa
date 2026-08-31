.class public final Lt/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:La0/q;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lt/l;

.field public final synthetic t:LX/e;


# direct methods
.method public constructor <init>(La0/q;Ljava/lang/Object;Lt/l;LX/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt/c;->q:La0/q;

    .line 2
    .line 3
    iput-object p2, p0, Lt/c;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lt/c;->s:Lt/l;

    .line 6
    .line 7
    iput-object p4, p0, Lt/c;->t:LX/e;

    .line 8
    .line 9
    const/4 p1, 0x3

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Lt/p;

    .line 2
    .line 3
    check-cast p2, LP/o;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    and-int/lit8 v0, p3, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    and-int/lit8 v0, p3, 0x8

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2, p1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x2

    .line 33
    :goto_1
    or-int/2addr p3, v0

    .line 34
    :cond_2
    and-int/lit8 v0, p3, 0x13

    .line 35
    .line 36
    const/16 v1, 0x12

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x1

    .line 40
    if-eq v0, v1, :cond_3

    .line 41
    .line 42
    move v0, v3

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    move v0, v2

    .line 45
    :goto_2
    and-int/2addr p3, v3

    .line 46
    invoke-virtual {p2, p3, v0}, LP/o;->K(IZ)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_7

    .line 51
    .line 52
    iget-object p3, p0, Lt/c;->q:La0/q;

    .line 53
    .line 54
    invoke-virtual {p2, p3}, LP/o;->g(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v1, p0, Lt/c;->r:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {p2, v1}, LP/o;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    or-int/2addr v0, v3

    .line 65
    iget-object v3, p0, Lt/c;->s:Lt/l;

    .line 66
    .line 67
    invoke-virtual {p2, v3}, LP/o;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    or-int/2addr v0, v4

    .line 72
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    sget-object v5, LP/k;->a:LP/S;

    .line 77
    .line 78
    if-nez v0, :cond_4

    .line 79
    .line 80
    if-ne v4, v5, :cond_5

    .line 81
    .line 82
    :cond_4
    new-instance v4, LA/J;

    .line 83
    .line 84
    const/16 v0, 0xa

    .line 85
    .line 86
    invoke-direct {v4, p3, v1, v3, v0}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v4}, LP/o;->d0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    check-cast v4, LB5/c;

    .line 93
    .line 94
    invoke-static {p1, v4, p2}, LP/b;->c(Ljava/lang/Object;LB5/c;LP/o;)V

    .line 95
    .line 96
    .line 97
    iget-object p3, v3, Lt/l;->d:Lr/G;

    .line 98
    .line 99
    const-string v0, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl"

    .line 100
    .line 101
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    check-cast p1, Lt/q;

    .line 105
    .line 106
    iget-object p1, p1, Lt/q;->a:LP/f0;

    .line 107
    .line 108
    invoke-virtual {p3, v1, p1}, Lr/G;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v5, :cond_6

    .line 116
    .line 117
    new-instance p1, Lt/g;

    .line 118
    .line 119
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    check-cast p1, Lt/g;

    .line 126
    .line 127
    iget-object p3, p0, Lt/c;->t:LX/e;

    .line 128
    .line 129
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {p3, p1, v1, p2, v0}, LX/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_7
    invoke-virtual {p2}, LP/o;->N()V

    .line 138
    .line 139
    .line 140
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 141
    .line 142
    return-object p1
.end method
