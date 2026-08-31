.class public final synthetic Lf5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/g;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LB5/c;

.field public final synthetic s:LP/W;


# direct methods
.method public synthetic constructor <init>(LR4/k1;LB5/c;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/h;->q:LR4/k1;

    iput-object p2, p0, Lf5/h;->r:LB5/c;

    iput-object p3, p0, Lf5/h;->s:LP/W;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, LF/C;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

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
    check-cast p4, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string p3, "$this$HorizontalPager"

    .line 18
    .line 19
    invoke-static {p1, p3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lf5/h;->s:LP/W;

    .line 23
    .line 24
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, LR4/O1;

    .line 29
    .line 30
    iget-object p3, p3, LR4/O1;->d:Ljava/util/List;

    .line 31
    .line 32
    if-eqz p3, :cond_0

    .line 33
    .line 34
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    check-cast p3, LR4/R1;

    .line 39
    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    iget-object p3, p3, LR4/R1;->a:Ljava/util/List;

    .line 43
    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    check-cast p3, Ljava/lang/Iterable;

    .line 47
    .line 48
    check-cast p3, Ljava/util/List;

    .line 49
    .line 50
    invoke-static {p3}, Ln5/l;->j0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    :goto_0
    move-object v1, p3

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    sget-object p3, Ln5/s;->q:Ln5/s;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p3

    .line 63
    check-cast p3, LR4/O1;

    .line 64
    .line 65
    iget-object p3, p3, LR4/O1;->d:Ljava/util/List;

    .line 66
    .line 67
    if-eqz p3, :cond_1

    .line 68
    .line 69
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    check-cast p3, LR4/R1;

    .line 74
    .line 75
    if-eqz p3, :cond_1

    .line 76
    .line 77
    iget-object p3, p3, LR4/R1;->b:Ljava/lang/Boolean;

    .line 78
    .line 79
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static {p3, p4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    goto :goto_2

    .line 86
    :cond_1
    const/4 p3, 0x0

    .line 87
    :goto_2
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    check-cast p3, LR4/O1;

    .line 96
    .line 97
    iget-object v3, p3, LR4/O1;->f:LR4/x;

    .line 98
    .line 99
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, LR4/O1;

    .line 104
    .line 105
    iget-object p1, p1, LR4/O1;->d:Ljava/util/List;

    .line 106
    .line 107
    if-eqz p1, :cond_2

    .line 108
    .line 109
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    check-cast p1, LR4/R1;

    .line 114
    .line 115
    if-eqz p1, :cond_2

    .line 116
    .line 117
    iget-object p1, p1, LR4/R1;->c:Ljava/lang/Integer;

    .line 118
    .line 119
    :goto_3
    move-object v5, p1

    .line 120
    goto :goto_4

    .line 121
    :cond_2
    const/4 p1, 0x0

    .line 122
    goto :goto_3

    .line 123
    :goto_4
    const/4 v7, 0x0

    .line 124
    iget-object v0, p0, Lf5/h;->q:LR4/k1;

    .line 125
    .line 126
    iget-object v4, p0, Lf5/h;->r:LB5/c;

    .line 127
    .line 128
    invoke-static/range {v0 .. v7}, LE3/h;->h(LR4/k1;Ljava/util/List;Ljava/lang/Boolean;LR4/x;LB5/c;Ljava/lang/Integer;LP/o;I)V

    .line 129
    .line 130
    .line 131
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 132
    .line 133
    return-object p1
.end method
