.class public final LA/b0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA/b0;->q:I

    iput-object p2, p0, LA/b0;->r:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LA/b0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lc0/m;

    .line 7
    .line 8
    check-cast p2, LP/o;

    .line 9
    .line 10
    check-cast p3, Ljava/lang/Number;

    .line 11
    .line 12
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 13
    .line 14
    .line 15
    const p1, -0x2d10e1f7

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Landroidx/compose/foundation/c;->a:LP/T0;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, LP/o;->k(LP/l0;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    move-object v2, p1

    .line 28
    check-cast v2, Lv/P;

    .line 29
    .line 30
    instance-of p1, v2, Lv/V;

    .line 31
    .line 32
    const/4 p3, 0x0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const p1, 0x24d0a640

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    :goto_0
    move-object v1, p1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const p1, 0x24d2ac4a

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    sget-object v0, LP/k;->a:LP/S;

    .line 58
    .line 59
    if-ne p1, v0, :cond_1

    .line 60
    .line 61
    new-instance p1, Ly/i;

    .line 62
    .line 63
    invoke-direct {p1}, Ly/i;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2, p1}, LP/o;->d0(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    check-cast p1, Ly/i;

    .line 70
    .line 71
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :goto_1
    iget-object p1, p0, LA/b0;->r:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v5, p1

    .line 78
    check-cast v5, LB5/a;

    .line 79
    .line 80
    sget-object v0, Lc0/j;->q:Lc0/j;

    .line 81
    .line 82
    const/4 v3, 0x1

    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/a;->b(Lc0/m;Ly/i;Lv/P;ZLI0/f;LB5/a;)Lc0/m;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p2, p3}, LP/o;->p(Z)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    :pswitch_0
    check-cast p1, Lz0/E;

    .line 93
    .line 94
    check-cast p2, Lz0/B;

    .line 95
    .line 96
    check-cast p3, LW0/a;

    .line 97
    .line 98
    iget-wide v0, p3, LW0/a;->a:J

    .line 99
    .line 100
    invoke-interface {p2, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    iget p3, p2, Lz0/J;->q:I

    .line 105
    .line 106
    iget v0, p2, Lz0/J;->r:I

    .line 107
    .line 108
    new-instance v1, LA/Y;

    .line 109
    .line 110
    iget-object v2, p0, LA/b0;->r:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Lt/s;

    .line 113
    .line 114
    const/16 v3, 0x18

    .line 115
    .line 116
    invoke-direct {v1, v3, p2, v2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 120
    .line 121
    invoke-interface {p1, p3, v0, p2, v1}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    return-object p1

    .line 126
    :pswitch_1
    check-cast p1, Lc0/m;

    .line 127
    .line 128
    check-cast p2, LP/o;

    .line 129
    .line 130
    check-cast p3, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 133
    .line 134
    .line 135
    const p1, -0x5461a65a

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, LA/b0;->r:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p1, LA/W;

    .line 144
    .line 145
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p3

    .line 149
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-nez p3, :cond_2

    .line 154
    .line 155
    sget-object p3, LP/k;->a:LP/S;

    .line 156
    .line 157
    if-ne v0, p3, :cond_3

    .line 158
    .line 159
    :cond_2
    new-instance v0, LA/F;

    .line 160
    .line 161
    invoke-direct {v0, p1}, LA/F;-><init>(LA/W;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    check-cast v0, LA/F;

    .line 168
    .line 169
    const/4 p1, 0x0

    .line 170
    invoke-virtual {p2, p1}, LP/o;->p(Z)V

    .line 171
    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_2
    check-cast p1, Lc0/m;

    .line 175
    .line 176
    check-cast p2, LP/o;

    .line 177
    .line 178
    check-cast p3, Ljava/lang/Number;

    .line 179
    .line 180
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 181
    .line 182
    .line 183
    const p1, -0x5fda9847

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2, p1}, LP/o;->S(I)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, LA/b0;->r:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p1, LB5/c;

    .line 192
    .line 193
    invoke-virtual {p2, p1}, LP/o;->g(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result p3

    .line 197
    invoke-virtual {p2}, LP/o;->H()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    if-nez p3, :cond_4

    .line 202
    .line 203
    sget-object p3, LP/k;->a:LP/S;

    .line 204
    .line 205
    if-ne v0, p3, :cond_5

    .line 206
    .line 207
    :cond_4
    new-instance v0, LA/v;

    .line 208
    .line 209
    invoke-direct {v0, p1}, LA/v;-><init>(LB5/c;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p2, v0}, LP/o;->d0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_5
    check-cast v0, LA/v;

    .line 216
    .line 217
    const/4 p1, 0x0

    .line 218
    invoke-virtual {p2, p1}, LP/o;->p(Z)V

    .line 219
    .line 220
    .line 221
    return-object v0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
