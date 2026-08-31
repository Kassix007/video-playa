.class public final Lt/j;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:J


# direct methods
.method public constructor <init>(JLP/S0;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lt/j;->q:I

    .line 1
    iput-wide p1, p0, Lt/j;->s:J

    iput-object p3, p0, Lt/j;->r:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lt/k;JI)V
    .locals 0

    .line 2
    iput p4, p0, Lt/j;->q:I

    iput-object p1, p0, Lt/j;->r:Ljava/lang/Object;

    iput-wide p2, p0, Lt/j;->s:J

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lt/j;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, Ll0/d;

    .line 8
    .line 9
    iget-object p1, p0, Lt/j;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, LP/S0;

    .line 12
    .line 13
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x0

    .line 24
    const/high16 v2, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-static {p1, v0, v2}, LD5/a;->p(FFF)F

    .line 27
    .line 28
    .line 29
    move-result v8

    .line 30
    const/16 v9, 0x76

    .line 31
    .line 32
    iget-wide v2, p0, Lt/j;->s:J

    .line 33
    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    const-wide/16 v6, 0x0

    .line 37
    .line 38
    invoke-static/range {v1 .. v9}, Ll0/d;->g0(Ll0/d;JJJFI)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_0
    iget-object v0, p0, Lt/j;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lt/k;

    .line 47
    .line 48
    iget-object v1, v0, Lt/k;->G:Lt/l;

    .line 49
    .line 50
    invoke-virtual {v1}, Lt/l;->a()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    iget-wide v1, v0, Lt/k;->H:J

    .line 61
    .line 62
    sget-wide v3, Landroidx/compose/animation/a;->a:J

    .line 63
    .line 64
    invoke-static {v1, v2, v3, v4}, LW0/k;->a(JJ)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    iget-wide v0, p0, Lt/j;->s:J

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    iget-wide v0, v0, Lt/k;->H:J

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    iget-object v0, v0, Lt/k;->G:Lt/l;

    .line 77
    .line 78
    iget-object v0, v0, Lt/l;->d:Lr/G;

    .line 79
    .line 80
    invoke-virtual {v0, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, LP/S0;

    .line 85
    .line 86
    if-eqz p1, :cond_2

    .line 87
    .line 88
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, LW0/k;

    .line 93
    .line 94
    iget-wide v0, p1, LW0/k;->a:J

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    const-wide/16 v0, 0x0

    .line 98
    .line 99
    :goto_0
    new-instance p1, LW0/k;

    .line 100
    .line 101
    invoke-direct {p1, v0, v1}, LW0/k;-><init>(J)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_1
    check-cast p1, Lu/q0;

    .line 106
    .line 107
    invoke-interface {p1}, Lu/q0;->a()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, Lt/j;->r:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lt/k;

    .line 114
    .line 115
    iget-object v2, v1, Lt/k;->G:Lt/l;

    .line 116
    .line 117
    invoke-virtual {v2}, Lt/l;->a()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    const-wide/16 v2, 0x0

    .line 126
    .line 127
    if-eqz v0, :cond_4

    .line 128
    .line 129
    iget-wide v4, v1, Lt/k;->H:J

    .line 130
    .line 131
    sget-wide v6, Landroidx/compose/animation/a;->a:J

    .line 132
    .line 133
    invoke-static {v4, v5, v6, v7}, LW0/k;->a(JJ)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    iget-wide v4, p0, Lt/j;->s:J

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    iget-wide v4, v1, Lt/k;->H:J

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    iget-object v0, v1, Lt/k;->G:Lt/l;

    .line 146
    .line 147
    iget-object v0, v0, Lt/l;->d:Lr/G;

    .line 148
    .line 149
    invoke-interface {p1}, Lu/q0;->a()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-virtual {v0, v4}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    check-cast v0, LP/S0;

    .line 158
    .line 159
    if-eqz v0, :cond_5

    .line 160
    .line 161
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    check-cast v0, LW0/k;

    .line 166
    .line 167
    iget-wide v4, v0, LW0/k;->a:J

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :cond_5
    move-wide v4, v2

    .line 171
    :goto_1
    iget-object v0, v1, Lt/k;->G:Lt/l;

    .line 172
    .line 173
    iget-object v0, v0, Lt/l;->d:Lr/G;

    .line 174
    .line 175
    invoke-interface {p1}, Lu/q0;->c()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {v0, p1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, LP/S0;

    .line 184
    .line 185
    if-eqz p1, :cond_6

    .line 186
    .line 187
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, LW0/k;

    .line 192
    .line 193
    iget-wide v2, p1, LW0/k;->a:J

    .line 194
    .line 195
    :cond_6
    iget-object p1, v1, Lt/k;->F:LP/W;

    .line 196
    .line 197
    invoke-interface {p1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    check-cast p1, Lt/J;

    .line 202
    .line 203
    if-eqz p1, :cond_7

    .line 204
    .line 205
    iget-object p1, p1, Lt/J;->a:LB5/e;

    .line 206
    .line 207
    new-instance v0, LW0/k;

    .line 208
    .line 209
    invoke-direct {v0, v4, v5}, LW0/k;-><init>(J)V

    .line 210
    .line 211
    .line 212
    new-instance v1, LW0/k;

    .line 213
    .line 214
    invoke-direct {v1, v2, v3}, LW0/k;-><init>(J)V

    .line 215
    .line 216
    .line 217
    invoke-interface {p1, v0, v1}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    check-cast p1, Lu/z;

    .line 222
    .line 223
    if-nez p1, :cond_8

    .line 224
    .line 225
    :cond_7
    const/4 p1, 0x5

    .line 226
    const/4 v0, 0x0

    .line 227
    invoke-static {p1, v0}, Lu/d;->o(ILjava/lang/Object;)Lu/f0;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    :cond_8
    return-object p1

    .line 232
    nop

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
