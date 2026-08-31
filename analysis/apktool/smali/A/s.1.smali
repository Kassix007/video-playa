.class public final LA/s;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:I

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Lh0/p;Lh0/o;Lh0/o;Ljava/lang/Object;ILA/J;I)V
    .locals 0

    .line 1
    iput p7, p0, LA/s;->q:I

    iput-object p2, p0, LA/s;->s:Ljava/lang/Object;

    iput-object p3, p0, LA/s;->t:Ljava/lang/Object;

    iput-object p4, p0, LA/s;->u:Ljava/lang/Object;

    iput p5, p0, LA/s;->r:I

    iput-object p6, p0, LA/s;->v:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method

.method public constructor <init>([Lz0/J;LA/t;ILB0/T;[I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA/s;->q:I

    .line 2
    iput-object p1, p0, LA/s;->s:Ljava/lang/Object;

    iput-object p2, p0, LA/s;->t:Ljava/lang/Object;

    iput p3, p0, LA/s;->r:I

    iput-object p4, p0, LA/s;->u:Ljava/lang/Object;

    iput-object p5, p0, LA/s;->v:Ljava/io/Serializable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, LA/s;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lz0/d;

    .line 7
    .line 8
    iget-object v0, p0, LA/s;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lh0/o;

    .line 11
    .line 12
    iget-object v1, p0, LA/s;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lh0/o;

    .line 15
    .line 16
    invoke-static {v0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, LC0/A;

    .line 21
    .line 22
    invoke-virtual {v2}, LC0/A;->getFocusOwner()Lh0/g;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lh0/h;

    .line 27
    .line 28
    iget-object v2, v2, Lh0/h;->j:Lh0/o;

    .line 29
    .line 30
    if-eq v1, v2, :cond_0

    .line 31
    .line 32
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object v1, p0, LA/s;->u:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Li0/c;

    .line 38
    .line 39
    iget-object v2, p0, LA/s;->v:Ljava/io/Serializable;

    .line 40
    .line 41
    check-cast v2, LA/J;

    .line 42
    .line 43
    iget v3, p0, LA/s;->r:I

    .line 44
    .line 45
    invoke-static {v3, v2, v0, v1}, Lh0/d;->B(ILA/J;Lh0/o;Li0/c;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-nez v0, :cond_2

    .line 54
    .line 55
    invoke-interface {p1}, Lz0/d;->a()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    const/4 p1, 0x0

    .line 63
    goto :goto_1

    .line 64
    :cond_2
    :goto_0
    move-object p1, v1

    .line 65
    :goto_1
    return-object p1

    .line 66
    :pswitch_0
    check-cast p1, Lz0/d;

    .line 67
    .line 68
    iget-object v0, p0, LA/s;->t:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lh0/o;

    .line 71
    .line 72
    iget-object v1, p0, LA/s;->s:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lh0/o;

    .line 75
    .line 76
    invoke-static {v0}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, LC0/A;

    .line 81
    .line 82
    invoke-virtual {v2}, LC0/A;->getFocusOwner()Lh0/g;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    check-cast v2, Lh0/h;

    .line 87
    .line 88
    iget-object v2, v2, Lh0/h;->j:Lh0/o;

    .line 89
    .line 90
    if-eq v1, v2, :cond_3

    .line 91
    .line 92
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    iget-object v1, p0, LA/s;->u:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v1, Lh0/o;

    .line 98
    .line 99
    iget-object v2, p0, LA/s;->v:Ljava/io/Serializable;

    .line 100
    .line 101
    check-cast v2, LA/J;

    .line 102
    .line 103
    iget v3, p0, LA/s;->r:I

    .line 104
    .line 105
    invoke-static {v0, v1, v3, v2}, Lh0/d;->C(Lh0/o;Lh0/o;ILA/J;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    invoke-interface {p1}, Lz0/d;->a()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-nez p1, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    const/4 p1, 0x0

    .line 123
    goto :goto_3

    .line 124
    :cond_5
    :goto_2
    move-object p1, v1

    .line 125
    :goto_3
    return-object p1

    .line 126
    :pswitch_1
    check-cast p1, Lz0/I;

    .line 127
    .line 128
    iget-object v0, p0, LA/s;->s:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, [Lz0/J;

    .line 131
    .line 132
    iget-object v1, p0, LA/s;->t:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v1, LA/t;

    .line 135
    .line 136
    iget-object v2, p0, LA/s;->u:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, LB0/T;

    .line 139
    .line 140
    iget-object v3, p0, LA/s;->v:Ljava/io/Serializable;

    .line 141
    .line 142
    check-cast v3, [I

    .line 143
    .line 144
    array-length v4, v0

    .line 145
    const/4 v5, 0x0

    .line 146
    move v6, v5

    .line 147
    move v7, v6

    .line 148
    :goto_4
    if-ge v6, v4, :cond_9

    .line 149
    .line 150
    aget-object v8, v0, v6

    .line 151
    .line 152
    add-int/lit8 v9, v7, 0x1

    .line 153
    .line 154
    invoke-static {v8}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8}, Lz0/J;->g()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    instance-of v11, v10, LA/N;

    .line 162
    .line 163
    const/4 v12, 0x0

    .line 164
    if-eqz v11, :cond_6

    .line 165
    .line 166
    check-cast v10, LA/N;

    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_6
    move-object v10, v12

    .line 170
    :goto_5
    invoke-interface {v2}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    if-eqz v10, :cond_7

    .line 175
    .line 176
    iget-object v12, v10, LA/N;->c:LA/w;

    .line 177
    .line 178
    :cond_7
    iget v10, p0, LA/s;->r:I

    .line 179
    .line 180
    if-eqz v12, :cond_8

    .line 181
    .line 182
    iget v13, v8, Lz0/J;->q:I

    .line 183
    .line 184
    sub-int/2addr v10, v13

    .line 185
    invoke-virtual {v12, v10, v11}, LA/w;->a(ILW0/l;)I

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    goto :goto_6

    .line 190
    :cond_8
    iget-object v12, v1, LA/t;->b:Lc0/c;

    .line 191
    .line 192
    iget v13, v8, Lz0/J;->q:I

    .line 193
    .line 194
    sub-int/2addr v10, v13

    .line 195
    invoke-virtual {v12, v5, v10, v11}, Lc0/c;->a(IILW0/l;)I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    :goto_6
    aget v7, v3, v7

    .line 200
    .line 201
    invoke-static {p1, v8, v10, v7}, Lz0/I;->d(Lz0/I;Lz0/J;II)V

    .line 202
    .line 203
    .line 204
    add-int/lit8 v6, v6, 0x1

    .line 205
    .line 206
    move v7, v9

    .line 207
    goto :goto_4

    .line 208
    :cond_9
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 209
    .line 210
    return-object p1

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
