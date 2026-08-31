.class public final LE/v;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, LE/v;->q:I

    iput-object p3, p0, LE/v;->s:Ljava/lang/Object;

    iput-object p4, p0, LE/v;->t:Ljava/lang/Object;

    iput p1, p0, LE/v;->r:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ILE/x;Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LE/v;->q:I

    .line 2
    iput-object p2, p0, LE/v;->s:Ljava/lang/Object;

    iput p1, p0, LE/v;->r:I

    iput-object p3, p0, LE/v;->t:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LE/v;->q:I

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
    iget-object p2, p0, LE/v;->s:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lc0/m;

    .line 16
    .line 17
    iget-object v0, p0, LE/v;->t:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LB5/e;

    .line 20
    .line 21
    iget v1, p0, LE/v;->r:I

    .line 22
    .line 23
    or-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    invoke-static {v1}, LP/b;->w(I)I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    invoke-static {p2, v0, p1, v1}, Ln5/A;->h(Lc0/m;LB5/e;LP/o;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_0
    check-cast p1, LP/o;

    .line 36
    .line 37
    check-cast p2, Ljava/lang/Number;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, LE/v;->s:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, LX/e;

    .line 45
    .line 46
    iget v0, p0, LE/v;->r:I

    .line 47
    .line 48
    invoke-static {v0}, LP/b;->w(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    or-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    iget-object v1, p0, LE/v;->t:Ljava/lang/Object;

    .line 55
    .line 56
    invoke-virtual {p2, v0, p1, v1}, LX/e;->b(ILP/o;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 60
    .line 61
    return-object p1

    .line 62
    :pswitch_1
    check-cast p1, LP/o;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Number;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 67
    .line 68
    .line 69
    iget-object p2, p0, LE/v;->s:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast p2, LP/m0;

    .line 72
    .line 73
    iget-object v0, p0, LE/v;->t:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, LX/e;

    .line 76
    .line 77
    iget v1, p0, LE/v;->r:I

    .line 78
    .line 79
    or-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    invoke-static {v1}, LP/b;->w(I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {p2, v0, p1, v1}, LP/b;->a(LP/m0;LX/e;LP/o;I)V

    .line 86
    .line 87
    .line 88
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 89
    .line 90
    return-object p1

    .line 91
    :pswitch_2
    check-cast p1, LP/o;

    .line 92
    .line 93
    check-cast p2, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, LE/v;->s:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p2, [LP/m0;

    .line 101
    .line 102
    array-length v0, p2

    .line 103
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, [LP/m0;

    .line 108
    .line 109
    iget-object v0, p0, LE/v;->t:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, LB5/e;

    .line 112
    .line 113
    iget v1, p0, LE/v;->r:I

    .line 114
    .line 115
    or-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    invoke-static {v1}, LP/b;->w(I)I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-static {p2, v0, p1, v1}, LP/b;->b([LP/m0;LB5/e;LP/o;I)V

    .line 122
    .line 123
    .line 124
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_3
    check-cast p1, LP/o;

    .line 128
    .line 129
    check-cast p2, Ljava/lang/Number;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    and-int/lit8 v0, p2, 0x3

    .line 136
    .line 137
    const/4 v1, 0x2

    .line 138
    const/4 v2, 0x1

    .line 139
    if-eq v0, v1, :cond_0

    .line 140
    .line 141
    move v0, v2

    .line 142
    goto :goto_0

    .line 143
    :cond_0
    const/4 v0, 0x0

    .line 144
    :goto_0
    and-int/2addr p2, v2

    .line 145
    invoke-virtual {p1, p2, v0}, LP/o;->K(IZ)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-eqz p2, :cond_1

    .line 150
    .line 151
    iget-object p2, p0, LE/v;->s:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p2, LE/x;

    .line 154
    .line 155
    iget v0, p0, LE/v;->r:I

    .line 156
    .line 157
    iget-object v1, p0, LE/v;->t:Ljava/lang/Object;

    .line 158
    .line 159
    invoke-interface {p2, v0, p1, v1}, LE/x;->e(ILP/o;Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    invoke-virtual {p1}, LP/o;->N()V

    .line 164
    .line 165
    .line 166
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 167
    .line 168
    return-object p1

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
