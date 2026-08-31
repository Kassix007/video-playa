.class public final LA/d0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, LA/d0;->q:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LA/d0;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, LP/k;->a:LP/S;

    .line 5
    .line 6
    const v3, 0x15733969

    .line 7
    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lc0/m;

    .line 13
    .line 14
    check-cast p2, LP/o;

    .line 15
    .line 16
    check-cast p3, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v3}, LP/o;->S(I)V

    .line 22
    .line 23
    .line 24
    sget-object p1, LA/Z;->v:Ljava/util/WeakHashMap;

    .line 25
    .line 26
    invoke-static {p2}, LA/b;->e(LP/o;)LA/Z;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez p3, :cond_0

    .line 39
    .line 40
    if-ne v0, v2, :cond_1

    .line 41
    .line 42
    :cond_0
    iget-object p1, p1, LA/Z;->f:LA/a;

    .line 43
    .line 44
    new-instance v0, LA/F;

    .line 45
    .line 46
    invoke-direct {v0, p1}, LA/F;-><init>(LA/W;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    check-cast v0, LA/F;

    .line 53
    .line 54
    invoke-virtual {p2, v1}, LP/o;->p(Z)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    check-cast p1, Lc0/m;

    .line 59
    .line 60
    check-cast p2, LP/o;

    .line 61
    .line 62
    check-cast p3, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2, v3}, LP/o;->S(I)V

    .line 68
    .line 69
    .line 70
    sget-object p1, LA/Z;->v:Ljava/util/WeakHashMap;

    .line 71
    .line 72
    invoke-static {p2}, LA/b;->e(LP/o;)LA/Z;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p3

    .line 80
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-nez p3, :cond_2

    .line 85
    .line 86
    if-ne v0, v2, :cond_3

    .line 87
    .line 88
    :cond_2
    iget-object p1, p1, LA/Z;->e:LA/a;

    .line 89
    .line 90
    new-instance v0, LA/F;

    .line 91
    .line 92
    invoke-direct {v0, p1}, LA/F;-><init>(LA/W;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    check-cast v0, LA/F;

    .line 99
    .line 100
    invoke-virtual {p2, v1}, LP/o;->p(Z)V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    :pswitch_1
    check-cast p1, Lc0/m;

    .line 105
    .line 106
    check-cast p2, LP/o;

    .line 107
    .line 108
    check-cast p3, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v3}, LP/o;->S(I)V

    .line 114
    .line 115
    .line 116
    sget-object p1, LA/Z;->v:Ljava/util/WeakHashMap;

    .line 117
    .line 118
    invoke-static {p2}, LA/b;->e(LP/o;)LA/Z;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    if-nez p3, :cond_4

    .line 131
    .line 132
    if-ne v0, v2, :cond_5

    .line 133
    .line 134
    :cond_4
    iget-object p1, p1, LA/Z;->c:LA/a;

    .line 135
    .line 136
    new-instance v0, LA/F;

    .line 137
    .line 138
    invoke-direct {v0, p1}, LA/F;-><init>(LA/W;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_5
    check-cast v0, LA/F;

    .line 145
    .line 146
    invoke-virtual {p2, v1}, LP/o;->p(Z)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
