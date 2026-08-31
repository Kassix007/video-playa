.class public final La5/x;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Lcom/web2native/MainActivity;

.field public final synthetic u:LB5/c;

.field public final synthetic v:LB5/a;

.field public final synthetic w:LP/W;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/web2native/MainActivity;LB5/c;LB5/a;LP/W;)V
    .locals 0

    .line 1
    iput-object p1, p0, La5/x;->q:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La5/x;->r:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, La5/x;->s:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, La5/x;->t:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    iput-object p5, p0, La5/x;->u:LB5/c;

    .line 10
    .line 11
    iput-object p6, p0, La5/x;->v:LB5/a;

    .line 12
    .line 13
    iput-object p7, p0, La5/x;->w:LP/W;

    .line 14
    .line 15
    const/4 p1, 0x4

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, LD/j;

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
    move-object v6, p3

    .line 10
    check-cast v6, LP/o;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v6, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p3

    .line 34
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v6, p2}, LP/o;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    const/16 p3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p3

    .line 50
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 51
    .line 52
    const/16 p4, 0x92

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v0, 0x1

    .line 56
    if-eq p3, p4, :cond_4

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p3, v8

    .line 61
    :goto_3
    and-int/2addr p1, v0

    .line 62
    invoke-virtual {v6, p1, p3}, LP/o;->K(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object p1, p0, La5/x;->q:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    move-object v0, p1

    .line 75
    check-cast v0, La5/c;

    .line 76
    .line 77
    const p1, -0x73539864

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6, p1}, LP/o;->S(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, La5/x;->v:LB5/a;

    .line 84
    .line 85
    invoke-virtual {v6, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-virtual {v6}, LP/o;->H()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    if-nez p2, :cond_5

    .line 94
    .line 95
    sget-object p2, LP/k;->a:LP/S;

    .line 96
    .line 97
    if-ne p3, p2, :cond_6

    .line 98
    .line 99
    :cond_5
    new-instance p3, La5/v;

    .line 100
    .line 101
    iget-object p2, p0, La5/x;->w:LP/W;

    .line 102
    .line 103
    invoke-direct {p3, p1, p2}, La5/v;-><init>(LB5/a;LP/W;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, p3}, LP/o;->d0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_6
    move-object v5, p3

    .line 110
    check-cast v5, LB5/a;

    .line 111
    .line 112
    const/4 v7, 0x0

    .line 113
    iget-object v1, p0, La5/x;->r:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v2, p0, La5/x;->s:Ljava/lang/String;

    .line 116
    .line 117
    iget-object v3, p0, La5/x;->t:Lcom/web2native/MainActivity;

    .line 118
    .line 119
    iget-object v4, p0, La5/x;->u:LB5/c;

    .line 120
    .line 121
    invoke-static/range {v0 .. v7}, LC3/a;->d(La5/c;Ljava/lang/String;Ljava/lang/String;Lcom/web2native/MainActivity;LB5/c;LB5/a;LP/o;I)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v8}, LP/o;->p(Z)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_7
    invoke-virtual {v6}, LP/o;->N()V

    .line 129
    .line 130
    .line 131
    :goto_4
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 132
    .line 133
    return-object p1
.end method
