.class public final Le5/i;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:LR4/k1;

.field public final synthetic s:LP/W;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(Ljava/util/List;LR4/k1;LP/W;LP/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/i;->q:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Le5/i;->r:LR4/k1;

    .line 4
    .line 5
    iput-object p3, p0, Le5/i;->s:LP/W;

    .line 6
    .line 7
    iput-object p4, p0, Le5/i;->t:LP/W;

    .line 8
    .line 9
    const/4 p1, 0x4

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LC/c;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, LP/o;

    .line 10
    .line 11
    check-cast p4, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    and-int/lit8 v0, p4, 0x6

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p3, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p1, 0x2

    .line 30
    :goto_0
    or-int/2addr p1, p4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move p1, p4

    .line 33
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 34
    .line 35
    if-nez p4, :cond_3

    .line 36
    .line 37
    invoke-virtual {p3, p2}, LP/o;->e(I)Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    if-eqz p4, :cond_2

    .line 42
    .line 43
    const/16 p4, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 p4, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr p1, p4

    .line 49
    :cond_3
    and-int/lit16 p4, p1, 0x93

    .line 50
    .line 51
    const/16 v0, 0x92

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    const/4 v2, 0x1

    .line 55
    if-eq p4, v0, :cond_4

    .line 56
    .line 57
    move p4, v2

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move p4, v1

    .line 60
    :goto_3
    and-int/2addr p1, v2

    .line 61
    invoke-virtual {p3, p1, p4}, LP/o;->K(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iget-object p1, p0, Le5/i;->q:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Le5/b;

    .line 74
    .line 75
    const p2, 0x2cfc64c4

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3, p2}, LP/o;->S(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p3}, LP/o;->H()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    sget-object p4, LP/k;->a:LP/S;

    .line 86
    .line 87
    if-ne p2, p4, :cond_5

    .line 88
    .line 89
    new-instance p2, La5/v;

    .line 90
    .line 91
    iget-object p4, p0, Le5/i;->t:LP/W;

    .line 92
    .line 93
    const/4 v0, 0x1

    .line 94
    iget-object v2, p0, Le5/i;->s:LP/W;

    .line 95
    .line 96
    invoke-direct {p2, v0, v2, p4}, La5/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3, p2}, LP/o;->d0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_5
    check-cast p2, LB5/a;

    .line 103
    .line 104
    const/16 p4, 0x180

    .line 105
    .line 106
    iget-object v0, p0, Le5/i;->r:LR4/k1;

    .line 107
    .line 108
    invoke-static {v0, p1, p2, p3, p4}, LQ2/g;->f(LR4/k1;Le5/b;LB5/a;LP/o;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3, v1}, LP/o;->p(Z)V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    invoke-virtual {p3}, LP/o;->N()V

    .line 116
    .line 117
    .line 118
    :goto_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 119
    .line 120
    return-object p1
.end method
