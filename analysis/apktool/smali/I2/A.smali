.class public final LI2/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic b:LI2/A;


# instance fields
.field public final synthetic a:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LI2/A;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, LI2/A;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LI2/A;->b:LI2/A;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LI2/A;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, LI2/A;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lr6/h;

    .line 10
    .line 11
    iget-object p1, p1, Lr6/h;->a:Lq6/x;

    .line 12
    .line 13
    check-cast p2, Lr6/h;

    .line 14
    .line 15
    iget-object p2, p2, Lr6/h;->a:Lq6/x;

    .line 16
    .line 17
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n2;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 23
    .line 24
    check-cast p2, Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    sub-int/2addr p1, p2

    .line 35
    return p1

    .line 36
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 37
    .line 38
    check-cast p2, Landroid/view/View;

    .line 39
    .line 40
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 41
    .line 42
    invoke-static {p1}, Lw1/B;->g(Landroid/view/View;)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {p2}, Lw1/B;->g(Landroid/view/View;)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    cmpl-float v0, p1, p2

    .line 51
    .line 52
    if-lez v0, :cond_0

    .line 53
    .line 54
    move v1, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    cmpg-float p1, p1, p2

    .line 57
    .line 58
    if-gez p1, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v1, v3

    .line 62
    :goto_0
    return v1

    .line 63
    :pswitch_2
    check-cast p1, Ld2/l;

    .line 64
    .line 65
    check-cast p2, Ld2/l;

    .line 66
    .line 67
    iget-object v0, p1, Ld2/l;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    if-nez v0, :cond_2

    .line 70
    .line 71
    move v4, v1

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    move v4, v3

    .line 74
    :goto_1
    iget-object v5, p2, Ld2/l;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 75
    .line 76
    if-nez v5, :cond_3

    .line 77
    .line 78
    move v5, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_3
    move v5, v3

    .line 81
    :goto_2
    if-eq v4, v5, :cond_4

    .line 82
    .line 83
    if-nez v0, :cond_5

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    iget-boolean v0, p1, Ld2/l;->a:Z

    .line 87
    .line 88
    iget-boolean v4, p2, Ld2/l;->a:Z

    .line 89
    .line 90
    if-eq v0, v4, :cond_6

    .line 91
    .line 92
    if-eqz v0, :cond_9

    .line 93
    .line 94
    :cond_5
    move v1, v2

    .line 95
    goto :goto_3

    .line 96
    :cond_6
    iget v0, p2, Ld2/l;->b:I

    .line 97
    .line 98
    iget v1, p1, Ld2/l;->b:I

    .line 99
    .line 100
    sub-int v1, v0, v1

    .line 101
    .line 102
    if-eqz v1, :cond_7

    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_7
    iget p1, p1, Ld2/l;->c:I

    .line 106
    .line 107
    iget p2, p2, Ld2/l;->c:I

    .line 108
    .line 109
    sub-int v1, p1, p2

    .line 110
    .line 111
    if-eqz v1, :cond_8

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_8
    move v1, v3

    .line 115
    :cond_9
    :goto_3
    return v1

    .line 116
    :pswitch_3
    check-cast p1, Lb1/f;

    .line 117
    .line 118
    check-cast p2, Lb1/f;

    .line 119
    .line 120
    iget p1, p1, Lb1/f;->r:I

    .line 121
    .line 122
    iget p2, p2, Lb1/f;->r:I

    .line 123
    .line 124
    sub-int/2addr p1, p2

    .line 125
    return p1

    .line 126
    :pswitch_4
    check-cast p2, Ljava/lang/Long;

    .line 127
    .line 128
    check-cast p1, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 131
    .line 132
    .line 133
    move-result-wide v0

    .line 134
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 135
    .line 136
    .line 137
    move-result-wide p1

    .line 138
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Long;->compare(JJ)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    return p1

    .line 143
    :pswitch_5
    check-cast p1, LL0/c;

    .line 144
    .line 145
    iget p1, p1, LL0/c;->b:I

    .line 146
    .line 147
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    check-cast p2, LL0/c;

    .line 152
    .line 153
    iget p2, p2, LL0/c;->b:I

    .line 154
    .line 155
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n2;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    return p1

    .line 164
    :pswitch_6
    check-cast p1, LL0/c;

    .line 165
    .line 166
    iget p1, p1, LL0/c;->b:I

    .line 167
    .line 168
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    check-cast p2, LL0/c;

    .line 173
    .line 174
    iget p2, p2, LL0/c;->b:I

    .line 175
    .line 176
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/measurement/n2;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    return p1

    .line 185
    :pswitch_7
    check-cast p2, LX2/a;

    .line 186
    .line 187
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p1, LX2/a;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-static {p2, p2}, Lcom/google/android/gms/internal/measurement/n2;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    return p1

    .line 204
    :pswitch_8
    check-cast p2, LT2/c;

    .line 205
    .line 206
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    const/4 p2, 0x2

    .line 210
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    check-cast p1, LT2/c;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-static {p2, p2}, Lcom/google/android/gms/internal/measurement/n2;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    return p1

    .line 224
    nop

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
