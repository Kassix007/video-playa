.class public final LC0/I;
.super Lw1/b;
.source "SourceFile"


# static fields
.field public static final P:Lr/u;


# instance fields
.field public A:Z

.field public B:LC0/F;

.field public C:Lr/v;

.field public final D:Lr/w;

.field public final E:Lr/t;

.field public final F:Lr/t;

.field public final G:Ljava/lang/String;

.field public final H:Ljava/lang/String;

.field public final I:LB0/G0;

.field public final J:Lr/v;

.field public K:LC0/V0;

.field public L:Z

.field public final M:LC0/m;

.field public final N:Ljava/util/ArrayList;

.field public final O:LC0/H;

.field public final d:LC0/A;

.field public e:I

.field public final f:LC0/H;

.field public final g:Landroid/view/accessibility/AccessibilityManager;

.field public h:J

.field public final i:LC0/B;

.field public final j:LC0/C;

.field public k:Ljava/util/List;

.field public final l:Landroid/os/Handler;

.field public final m:LC0/E;

.field public n:I

.field public o:I

.field public p:Lx1/e;

.field public q:Lx1/e;

.field public r:Z

.field public final s:Lr/v;

.field public final t:Lr/v;

.field public final u:Lr/S;

.field public final v:Lr/S;

.field public w:I

.field public x:Ljava/lang/Integer;

.field public final y:Lr/f;

.field public final z:LO5/e;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sget-object v2, Lr/j;->a:Lr/u;

    .line 9
    .line 10
    new-instance v2, Lr/u;

    .line 11
    .line 12
    invoke-direct {v2, v0}, Lr/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget v3, v2, Lr/u;->b:I

    .line 16
    .line 17
    if-ltz v3, :cond_1

    .line 18
    .line 19
    add-int/lit8 v4, v3, 0x20

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Lr/u;->b(I)V

    .line 22
    .line 23
    .line 24
    iget-object v5, v2, Lr/u;->a:[I

    .line 25
    .line 26
    iget v6, v2, Lr/u;->b:I

    .line 27
    .line 28
    if-eq v3, v6, :cond_0

    .line 29
    .line 30
    invoke-static {v4, v3, v6, v5, v5}, Ln5/k;->C0(III[I[I)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const/4 v4, 0x0

    .line 34
    const/16 v6, 0xc

    .line 35
    .line 36
    invoke-static {v3, v4, v6, v1, v5}, Ln5/k;->F0(III[I[I)V

    .line 37
    .line 38
    .line 39
    iget v1, v2, Lr/u;->b:I

    .line 40
    .line 41
    add-int/2addr v1, v0

    .line 42
    iput v1, v2, Lr/u;->b:I

    .line 43
    .line 44
    sput-object v2, LC0/I;->P:Lr/u;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const-string v0, ""

    .line 48
    .line 49
    invoke-static {v0}, Ls/a;->d(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    throw v0

    .line 54
    nop

    .line 55
    :array_0
    .array-data 4
        0x7f090011
        0x7f090012
        0x7f09001d
        0x7f090028
        0x7f09002b
        0x7f09002c
        0x7f09002d
        0x7f09002e
        0x7f09002f
        0x7f090030
        0x7f090013
        0x7f090014
        0x7f090015
        0x7f090016
        0x7f090017
        0x7f090018
        0x7f090019
        0x7f09001a
        0x7f09001b
        0x7f09001c
        0x7f09001e
        0x7f09001f
        0x7f090020
        0x7f090021
        0x7f090022
        0x7f090023
        0x7f090024
        0x7f090025
        0x7f090026
        0x7f090027
        0x7f090029
        0x7f09002a
    .end array-data
.end method

.method public constructor <init>(LC0/A;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lw1/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LC0/I;->d:LC0/A;

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, LC0/I;->e:I

    .line 9
    .line 10
    new-instance v1, LC0/H;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, LC0/H;-><init>(LC0/I;I)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, LC0/I;->f:LC0/H;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "accessibility"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    iput-object v1, p0, LC0/I;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 36
    .line 37
    const-wide/16 v2, 0x64

    .line 38
    .line 39
    iput-wide v2, p0, LC0/I;->h:J

    .line 40
    .line 41
    new-instance v2, LC0/B;

    .line 42
    .line 43
    invoke-direct {v2, p0}, LC0/B;-><init>(LC0/I;)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, LC0/I;->i:LC0/B;

    .line 47
    .line 48
    new-instance v2, LC0/C;

    .line 49
    .line 50
    invoke-direct {v2, p0}, LC0/C;-><init>(LC0/I;)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, LC0/I;->j:LC0/C;

    .line 54
    .line 55
    const/4 v2, -0x1

    .line 56
    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, LC0/I;->k:Ljava/util/List;

    .line 61
    .line 62
    new-instance v1, Landroid/os/Handler;

    .line 63
    .line 64
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, LC0/I;->l:Landroid/os/Handler;

    .line 72
    .line 73
    new-instance v1, LC0/E;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct {v1, p0, v3}, LC0/E;-><init>(Lw1/b;I)V

    .line 77
    .line 78
    .line 79
    iput-object v1, p0, LC0/I;->m:LC0/E;

    .line 80
    .line 81
    iput v0, p0, LC0/I;->n:I

    .line 82
    .line 83
    iput v0, p0, LC0/I;->o:I

    .line 84
    .line 85
    new-instance v0, Lr/v;

    .line 86
    .line 87
    invoke-direct {v0}, Lr/v;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, LC0/I;->s:Lr/v;

    .line 91
    .line 92
    new-instance v0, Lr/v;

    .line 93
    .line 94
    invoke-direct {v0}, Lr/v;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, LC0/I;->t:Lr/v;

    .line 98
    .line 99
    new-instance v0, Lr/S;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    invoke-direct {v0, v1}, Lr/S;-><init>(I)V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, LC0/I;->u:Lr/S;

    .line 106
    .line 107
    new-instance v0, Lr/S;

    .line 108
    .line 109
    invoke-direct {v0, v1}, Lr/S;-><init>(I)V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, LC0/I;->v:Lr/S;

    .line 113
    .line 114
    iput v2, p0, LC0/I;->w:I

    .line 115
    .line 116
    new-instance v0, Lr/f;

    .line 117
    .line 118
    invoke-direct {v0, v1}, Lr/f;-><init>(I)V

    .line 119
    .line 120
    .line 121
    iput-object v0, p0, LC0/I;->y:Lr/f;

    .line 122
    .line 123
    const/4 v0, 0x6

    .line 124
    const/4 v1, 0x1

    .line 125
    const/4 v2, 0x0

    .line 126
    invoke-static {v1, v2, v0}, Ll6/d;->e(ILO5/a;I)LO5/e;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, LC0/I;->z:LO5/e;

    .line 131
    .line 132
    iput-boolean v1, p0, LC0/I;->A:Z

    .line 133
    .line 134
    sget-object v0, Lr/l;->a:Lr/v;

    .line 135
    .line 136
    const-string v1, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>"

    .line 137
    .line 138
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iput-object v0, p0, LC0/I;->C:Lr/v;

    .line 142
    .line 143
    new-instance v2, Lr/w;

    .line 144
    .line 145
    invoke-direct {v2}, Lr/w;-><init>()V

    .line 146
    .line 147
    .line 148
    iput-object v2, p0, LC0/I;->D:Lr/w;

    .line 149
    .line 150
    new-instance v2, Lr/t;

    .line 151
    .line 152
    invoke-direct {v2}, Lr/t;-><init>()V

    .line 153
    .line 154
    .line 155
    iput-object v2, p0, LC0/I;->E:Lr/t;

    .line 156
    .line 157
    new-instance v2, Lr/t;

    .line 158
    .line 159
    invoke-direct {v2}, Lr/t;-><init>()V

    .line 160
    .line 161
    .line 162
    iput-object v2, p0, LC0/I;->F:Lr/t;

    .line 163
    .line 164
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"

    .line 165
    .line 166
    iput-object v2, p0, LC0/I;->G:Ljava/lang/String;

    .line 167
    .line 168
    const-string v2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"

    .line 169
    .line 170
    iput-object v2, p0, LC0/I;->H:Ljava/lang/String;

    .line 171
    .line 172
    new-instance v2, LB0/G0;

    .line 173
    .line 174
    const/16 v3, 0xf

    .line 175
    .line 176
    invoke-direct {v2, v3}, LB0/G0;-><init>(I)V

    .line 177
    .line 178
    .line 179
    iput-object v2, p0, LC0/I;->I:LB0/G0;

    .line 180
    .line 181
    new-instance v2, Lr/v;

    .line 182
    .line 183
    invoke-direct {v2}, Lr/v;-><init>()V

    .line 184
    .line 185
    .line 186
    iput-object v2, p0, LC0/I;->J:Lr/v;

    .line 187
    .line 188
    new-instance v2, LC0/V0;

    .line 189
    .line 190
    invoke-virtual {p1}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {v3}, LI0/n;->a()LI0/m;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-direct {v2, v3, v0}, LC0/V0;-><init>(LI0/m;Lr/k;)V

    .line 202
    .line 203
    .line 204
    iput-object v2, p0, LC0/I;->K:LC0/V0;

    .line 205
    .line 206
    new-instance v0, LC0/D;

    .line 207
    .line 208
    const/4 v1, 0x0

    .line 209
    invoke-direct {v0, v1, p0}, LC0/D;-><init>(ILjava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 213
    .line 214
    .line 215
    new-instance p1, LC0/m;

    .line 216
    .line 217
    const/4 v0, 0x1

    .line 218
    invoke-direct {p1, v0, p0}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iput-object p1, p0, LC0/I;->M:LC0/m;

    .line 222
    .line 223
    new-instance p1, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object p1, p0, LC0/I;->N:Ljava/util/ArrayList;

    .line 229
    .line 230
    new-instance p1, LC0/H;

    .line 231
    .line 232
    invoke-direct {p1, p0, v0}, LC0/H;-><init>(LC0/I;I)V

    .line 233
    .line 234
    .line 235
    iput-object p1, p0, LC0/I;->O:LC0/H;

    .line 236
    .line 237
    return-void
.end method

.method public static synthetic D(LC0/I;IILjava/lang/Integer;I)V
    .locals 1

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3, v0}, LC0/I;->C(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static K(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0x186a0

    .line 13
    .line 14
    .line 15
    if-gt v0, v1, :cond_1

    .line 16
    .line 17
    :goto_0
    return-object p0

    .line 18
    :cond_1
    const v0, 0x1869f

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-interface {p0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    move v1, v0

    .line 42
    :cond_2
    const/4 v0, 0x0

    .line 43
    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize"

    .line 48
    .line 49
    invoke-static {p0, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public static t(LI0/m;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_0

    .line 5
    :cond_0
    iget-object p0, p0, LI0/m;->d:LI0/i;

    .line 6
    .line 7
    iget-object v1, p0, LI0/i;->q:Lr/G;

    .line 8
    .line 9
    sget-object v2, LI0/p;->a:LI0/s;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0, v2}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Ljava/util/List;

    .line 22
    .line 23
    const-string v0, ","

    .line 24
    .line 25
    const/16 v1, 0x3e

    .line 26
    .line 27
    invoke-static {v1, v0, p0}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    sget-object p0, LI0/p;->C:LI0/s;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    move-object p0, v0

    .line 47
    :cond_2
    check-cast p0, LL0/d;

    .line 48
    .line 49
    if-eqz p0, :cond_5

    .line 50
    .line 51
    iget-object p0, p0, LL0/d;->r:Ljava/lang/String;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_3
    sget-object p0, LI0/p;->y:LI0/s;

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    move-object p0, v0

    .line 63
    :cond_4
    check-cast p0, Ljava/util/List;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-static {p0}, Ln5/l;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, LL0/d;

    .line 72
    .line 73
    if-eqz p0, :cond_5

    .line 74
    .line 75
    iget-object p0, p0, LL0/d;->r:Ljava/lang/String;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_5
    :goto_0
    return-object v0
.end method

.method public static final w(LI0/g;F)Z
    .locals 3

    .line 1
    iget-object v0, p0, LI0/g;->a:LE/Q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v2, p1, v1

    .line 5
    .line 6
    if-gez v2, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    cmpl-float v2, v2, v1

    .line 19
    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    :cond_0
    cmpl-float p1, p1, v1

    .line 23
    .line 24
    if-lez p1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, LI0/g;->b:LE/Q;

    .line 37
    .line 38
    invoke-virtual {p0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    cmpg-float p0, p1, p0

    .line 49
    .line 50
    if-gez p0, :cond_2

    .line 51
    .line 52
    :cond_1
    const/4 p0, 0x1

    .line 53
    return p0

    .line 54
    :cond_2
    const/4 p0, 0x0

    .line 55
    return p0
.end method

.method public static final x(LI0/g;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LI0/g;->a:LE/Q;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    cmpl-float v1, v1, v2

    .line 15
    .line 16
    if-lez v1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, LI0/g;->b:LE/Q;

    .line 30
    .line 31
    invoke-virtual {p0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static final y(LI0/g;)Z
    .locals 2

    .line 1
    iget-object v0, p0, LI0/g;->a:LE/Q;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, LI0/g;->b:LE/Q;

    .line 14
    .line 15
    invoke-virtual {p0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ljava/lang/Number;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    cmpg-float p0, v1, p0

    .line 26
    .line 27
    if-gez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return p0
.end method


# virtual methods
.method public final A(LI0/m;LC0/V0;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget-object v3, Lr/m;->a:[I

    .line 8
    .line 9
    new-instance v3, Lr/w;

    .line 10
    .line 11
    invoke-direct {v3}, Lr/w;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v4, 0x4

    .line 15
    invoke-static {v4, v1}, LI0/m;->h(ILI0/m;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    iget-object v6, v1, LI0/m;->c:LB0/L;

    .line 20
    .line 21
    move-object v7, v5

    .line 22
    check-cast v7, Ljava/util/Collection;

    .line 23
    .line 24
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    const/4 v8, 0x0

    .line 29
    move v9, v8

    .line 30
    :goto_0
    if-ge v9, v7, :cond_2

    .line 31
    .line 32
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v10

    .line 36
    check-cast v10, LI0/m;

    .line 37
    .line 38
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 39
    .line 40
    .line 41
    move-result-object v11

    .line 42
    iget v10, v10, LI0/m;->g:I

    .line 43
    .line 44
    invoke-virtual {v11, v10}, Lr/k;->a(I)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v11, :cond_1

    .line 49
    .line 50
    iget-object v11, v2, LC0/V0;->b:Lr/w;

    .line 51
    .line 52
    invoke-virtual {v11, v10}, Lr/w;->b(I)Z

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-nez v11, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v6}, LC0/I;->v(LB0/L;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    invoke-virtual {v3, v10}, Lr/w;->a(I)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget-object v2, v2, LC0/V0;->b:Lr/w;

    .line 69
    .line 70
    iget-object v5, v2, Lr/w;->b:[I

    .line 71
    .line 72
    iget-object v2, v2, Lr/w;->a:[J

    .line 73
    .line 74
    array-length v7, v2

    .line 75
    add-int/lit8 v7, v7, -0x2

    .line 76
    .line 77
    if-ltz v7, :cond_6

    .line 78
    .line 79
    move v9, v8

    .line 80
    :goto_1
    aget-wide v10, v2, v9

    .line 81
    .line 82
    not-long v12, v10

    .line 83
    const/4 v14, 0x7

    .line 84
    shl-long/2addr v12, v14

    .line 85
    and-long/2addr v12, v10

    .line 86
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    and-long/2addr v12, v14

    .line 92
    cmp-long v12, v12, v14

    .line 93
    .line 94
    if-eqz v12, :cond_5

    .line 95
    .line 96
    sub-int v12, v9, v7

    .line 97
    .line 98
    not-int v12, v12

    .line 99
    ushr-int/lit8 v12, v12, 0x1f

    .line 100
    .line 101
    const/16 v13, 0x8

    .line 102
    .line 103
    rsub-int/lit8 v12, v12, 0x8

    .line 104
    .line 105
    move v14, v8

    .line 106
    :goto_2
    if-ge v14, v12, :cond_4

    .line 107
    .line 108
    const-wide/16 v15, 0xff

    .line 109
    .line 110
    and-long/2addr v15, v10

    .line 111
    const-wide/16 v17, 0x80

    .line 112
    .line 113
    cmp-long v15, v15, v17

    .line 114
    .line 115
    if-gez v15, :cond_3

    .line 116
    .line 117
    shl-int/lit8 v15, v9, 0x3

    .line 118
    .line 119
    add-int/2addr v15, v14

    .line 120
    aget v15, v5, v15

    .line 121
    .line 122
    invoke-virtual {v3, v15}, Lr/w;->b(I)Z

    .line 123
    .line 124
    .line 125
    move-result v15

    .line 126
    if-nez v15, :cond_3

    .line 127
    .line 128
    invoke-virtual {v0, v6}, LC0/I;->v(LB0/L;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    shr-long/2addr v10, v13

    .line 133
    add-int/lit8 v14, v14, 0x1

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_4
    if-ne v12, v13, :cond_6

    .line 137
    .line 138
    :cond_5
    if-eq v9, v7, :cond_6

    .line 139
    .line 140
    add-int/lit8 v9, v9, 0x1

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_6
    invoke-static {v4, v1}, LI0/m;->h(ILI0/m;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    move-object v2, v1

    .line 148
    check-cast v2, Ljava/util/Collection;

    .line 149
    .line 150
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    :goto_3
    if-ge v8, v2, :cond_8

    .line 155
    .line 156
    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    check-cast v3, LI0/m;

    .line 161
    .line 162
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    iget v5, v3, LI0/m;->g:I

    .line 167
    .line 168
    invoke-virtual {v4, v5}, Lr/k;->a(I)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-eqz v4, :cond_7

    .line 173
    .line 174
    iget-object v4, v0, LC0/I;->J:Lr/v;

    .line 175
    .line 176
    iget v5, v3, LI0/m;->g:I

    .line 177
    .line 178
    invoke-virtual {v4, v5}, Lr/k;->b(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    check-cast v4, LC0/V0;

    .line 186
    .line 187
    invoke-virtual {v0, v3, v4}, LC0/I;->A(LI0/m;LC0/V0;)V

    .line 188
    .line 189
    .line 190
    :cond_7
    add-int/lit8 v8, v8, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_8
    return-void
.end method

.method public final B(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, LC0/I;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v2, 0x800

    .line 14
    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v2, 0x8000

    .line 22
    .line 23
    .line 24
    if-ne v0, v2, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, LC0/I;->r:Z

    .line 28
    .line 29
    :cond_2
    :try_start_0
    iget-object v0, p0, LC0/I;->f:LC0/H;

    .line 30
    .line 31
    invoke-virtual {v0, p1}, LC0/H;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    iput-boolean v1, p0, LC0/I;->r:Z

    .line 42
    .line 43
    return p1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    iput-boolean v1, p0, LC0/I;->r:Z

    .line 46
    .line 47
    throw p1
.end method

.method public final C(IILjava/lang/Integer;Ljava/util/List;)Z
    .locals 1

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-eq p1, v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, LC0/I;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    const-string p2, ","

    .line 28
    .line 29
    const/16 p3, 0x3e

    .line 30
    .line 31
    invoke-static {p3, p2, p4}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {p0, p1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1

    .line 43
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method public final E(Ljava/lang/String;II)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, LC0/I;->z(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/16 v0, 0x20

    .line 6
    .line 7
    invoke-virtual {p0, p2, v0}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2, p3}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p2}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final F(I)V
    .locals 6

    .line 1
    iget-object v0, p0, LC0/I;->B:LC0/F;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, LC0/F;->a:LI0/m;

    .line 6
    .line 7
    iget v2, v1, LI0/m;->g:I

    .line 8
    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, v0, LC0/F;->f:J

    .line 17
    .line 18
    sub-long/2addr v2, v4

    .line 19
    const-wide/16 v4, 0x3e8

    .line 20
    .line 21
    cmp-long p1, v2, v4

    .line 22
    .line 23
    if-gtz p1, :cond_1

    .line 24
    .line 25
    iget p1, v1, LI0/m;->g:I

    .line 26
    .line 27
    invoke-virtual {p0, p1}, LC0/I;->z(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 v2, 0x20000

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget v2, v0, LC0/F;->d:I

    .line 38
    .line 39
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 40
    .line 41
    .line 42
    iget v2, v0, LC0/F;->e:I

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 45
    .line 46
    .line 47
    iget v2, v0, LC0/F;->b:I

    .line 48
    .line 49
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setAction(I)V

    .line 50
    .line 51
    .line 52
    iget v0, v0, LC0/F;->c:I

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityEvent;->setMovementGranularity(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v1}, LC0/I;->t(LI0/m;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, LC0/I;->B:LC0/F;

    .line 73
    .line 74
    return-void
.end method

.method public final G(Lr/k;)V
    .locals 56

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    const/16 v1, 0x40

    .line 6
    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v7

    .line 11
    new-instance v8, Ljava/util/ArrayList;

    .line 12
    .line 13
    iget-object v9, v0, LC0/I;->N:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    .line 19
    .line 20
    .line 21
    iget-object v10, v6, Lr/k;->b:[I

    .line 22
    .line 23
    iget-object v11, v6, Lr/k;->a:[J

    .line 24
    .line 25
    array-length v1, v11

    .line 26
    const/4 v12, 0x2

    .line 27
    add-int/lit8 v13, v1, -0x2

    .line 28
    .line 29
    const/4 v14, 0x0

    .line 30
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-ltz v13, :cond_51

    .line 35
    .line 36
    move v15, v14

    .line 37
    :goto_0
    aget-wide v3, v11, v15

    .line 38
    .line 39
    move/from16 v16, v12

    .line 40
    .line 41
    move/from16 v17, v13

    .line 42
    .line 43
    not-long v12, v3

    .line 44
    const/16 v18, 0x7

    .line 45
    .line 46
    shl-long v12, v12, v18

    .line 47
    .line 48
    and-long/2addr v12, v3

    .line 49
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v12, v12, v19

    .line 55
    .line 56
    cmp-long v1, v12, v19

    .line 57
    .line 58
    if-eqz v1, :cond_50

    .line 59
    .line 60
    sub-int v1, v15, v17

    .line 61
    .line 62
    not-int v1, v1

    .line 63
    ushr-int/lit8 v1, v1, 0x1f

    .line 64
    .line 65
    const/16 v12, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v13, v1, 0x8

    .line 68
    .line 69
    move-wide/from16 v21, v3

    .line 70
    .line 71
    move v1, v14

    .line 72
    :goto_1
    if-ge v1, v13, :cond_4f

    .line 73
    .line 74
    const-wide/16 v23, 0xff

    .line 75
    .line 76
    and-long v3, v21, v23

    .line 77
    .line 78
    const-wide/16 v25, 0x80

    .line 79
    .line 80
    cmp-long v3, v3, v25

    .line 81
    .line 82
    if-gez v3, :cond_4e

    .line 83
    .line 84
    shl-int/lit8 v3, v15, 0x3

    .line 85
    .line 86
    add-int/2addr v3, v1

    .line 87
    aget v3, v10, v3

    .line 88
    .line 89
    iget-object v4, v0, LC0/I;->J:Lr/v;

    .line 90
    .line 91
    invoke-virtual {v4, v3}, Lr/k;->b(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    check-cast v4, LC0/V0;

    .line 96
    .line 97
    if-nez v4, :cond_0

    .line 98
    .line 99
    goto/16 :goto_2b

    .line 100
    .line 101
    :cond_0
    iget-object v4, v4, LC0/V0;->a:LI0/i;

    .line 102
    .line 103
    iget-object v5, v4, LI0/i;->q:Lr/G;

    .line 104
    .line 105
    invoke-virtual {v6, v3}, Lr/k;->b(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v27

    .line 109
    move-object/from16 v14, v27

    .line 110
    .line 111
    check-cast v14, LC0/W0;

    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    if-eqz v14, :cond_1

    .line 116
    .line 117
    iget-object v14, v14, LC0/W0;->a:LI0/m;

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    move-object/from16 v14, v27

    .line 121
    .line 122
    :goto_2
    if-eqz v14, :cond_4d

    .line 123
    .line 124
    move/from16 v28, v12

    .line 125
    .line 126
    iget-object v12, v14, LI0/m;->c:LB0/L;

    .line 127
    .line 128
    iget-object v6, v14, LI0/m;->d:LI0/i;

    .line 129
    .line 130
    move-object/from16 v29, v10

    .line 131
    .line 132
    iget v10, v14, LI0/m;->g:I

    .line 133
    .line 134
    move-object/from16 v30, v11

    .line 135
    .line 136
    iget-object v11, v6, LI0/i;->q:Lr/G;

    .line 137
    .line 138
    move/from16 v31, v15

    .line 139
    .line 140
    iget-object v15, v11, Lr/G;->b:[Ljava/lang/Object;

    .line 141
    .line 142
    move-object/from16 v32, v15

    .line 143
    .line 144
    iget-object v15, v11, Lr/G;->c:[Ljava/lang/Object;

    .line 145
    .line 146
    move-object/from16 v33, v15

    .line 147
    .line 148
    iget-object v15, v11, Lr/G;->a:[J

    .line 149
    .line 150
    move/from16 v34, v1

    .line 151
    .line 152
    array-length v1, v15

    .line 153
    add-int/lit8 v1, v1, -0x2

    .line 154
    .line 155
    move-object/from16 v35, v15

    .line 156
    .line 157
    if-ltz v1, :cond_47

    .line 158
    .line 159
    move-object/from16 v39, v12

    .line 160
    .line 161
    move/from16 v38, v13

    .line 162
    .line 163
    const/4 v15, 0x0

    .line 164
    const/16 v37, 0x0

    .line 165
    .line 166
    :goto_3
    aget-wide v12, v35, v15

    .line 167
    .line 168
    move-object/from16 v40, v14

    .line 169
    .line 170
    move/from16 v41, v15

    .line 171
    .line 172
    not-long v14, v12

    .line 173
    shl-long v14, v14, v18

    .line 174
    .line 175
    and-long/2addr v14, v12

    .line 176
    and-long v14, v14, v19

    .line 177
    .line 178
    cmp-long v14, v14, v19

    .line 179
    .line 180
    if-eqz v14, :cond_46

    .line 181
    .line 182
    sub-int v15, v41, v1

    .line 183
    .line 184
    not-int v14, v15

    .line 185
    ushr-int/lit8 v14, v14, 0x1f

    .line 186
    .line 187
    rsub-int/lit8 v14, v14, 0x8

    .line 188
    .line 189
    const/4 v15, 0x0

    .line 190
    :goto_4
    if-ge v15, v14, :cond_45

    .line 191
    .line 192
    and-long v42, v12, v23

    .line 193
    .line 194
    cmp-long v42, v42, v25

    .line 195
    .line 196
    if-gez v42, :cond_44

    .line 197
    .line 198
    shl-int/lit8 v42, v41, 0x3

    .line 199
    .line 200
    add-int v42, v42, v15

    .line 201
    .line 202
    aget-object v43, v32, v42

    .line 203
    .line 204
    move/from16 v44, v1

    .line 205
    .line 206
    aget-object v1, v33, v42

    .line 207
    .line 208
    move-object/from16 v42, v4

    .line 209
    .line 210
    move-object/from16 v4, v43

    .line 211
    .line 212
    check-cast v4, LI0/s;

    .line 213
    .line 214
    move-wide/from16 v45, v12

    .line 215
    .line 216
    sget-object v12, LI0/p;->s:LI0/s;

    .line 217
    .line 218
    invoke-static {v4, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v13

    .line 222
    if-nez v13, :cond_3

    .line 223
    .line 224
    sget-object v13, LI0/p;->t:LI0/s;

    .line 225
    .line 226
    invoke-static {v4, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v13

    .line 230
    if-eqz v13, :cond_2

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_2
    const/16 v43, 0x0

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_3
    :goto_5
    invoke-static {v3, v8}, LC0/W;->e(ILjava/util/ArrayList;)LC0/U0;

    .line 237
    .line 238
    .line 239
    move-result-object v13

    .line 240
    if-eqz v13, :cond_4

    .line 241
    .line 242
    const/16 v43, 0x0

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_4
    new-instance v13, LC0/U0;

    .line 246
    .line 247
    invoke-direct {v13, v3, v9}, LC0/U0;-><init>(ILjava/util/ArrayList;)V

    .line 248
    .line 249
    .line 250
    const/16 v43, 0x1

    .line 251
    .line 252
    :goto_6
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    :goto_7
    if-nez v43, :cond_6

    .line 256
    .line 257
    invoke-virtual {v5, v4}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    if-nez v13, :cond_5

    .line 262
    .line 263
    move-object/from16 v13, v27

    .line 264
    .line 265
    :cond_5
    invoke-static {v1, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v13

    .line 269
    if-eqz v13, :cond_6

    .line 270
    .line 271
    move-object/from16 v51, v7

    .line 272
    .line 273
    move-object/from16 v43, v8

    .line 274
    .line 275
    move-object/from16 v13, v39

    .line 276
    .line 277
    move-object v8, v2

    .line 278
    move v7, v3

    .line 279
    move-object v2, v5

    .line 280
    :goto_8
    move/from16 v3, v44

    .line 281
    .line 282
    goto/16 :goto_26

    .line 283
    .line 284
    :cond_6
    sget-object v13, LI0/p;->d:LI0/s;

    .line 285
    .line 286
    invoke-static {v4, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v43

    .line 290
    if-eqz v43, :cond_8

    .line 291
    .line 292
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 293
    .line 294
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    check-cast v1, Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v5, v13}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_7

    .line 304
    .line 305
    move/from16 v4, v28

    .line 306
    .line 307
    invoke-virtual {v0, v1, v3, v4}, LC0/I;->E(Ljava/lang/String;II)V

    .line 308
    .line 309
    .line 310
    :cond_7
    :goto_9
    move-object/from16 v51, v7

    .line 311
    .line 312
    move-object/from16 v43, v8

    .line 313
    .line 314
    move-object/from16 v13, v39

    .line 315
    .line 316
    move-object v8, v2

    .line 317
    move v7, v3

    .line 318
    move-object v2, v5

    .line 319
    move/from16 v3, v44

    .line 320
    .line 321
    :goto_a
    const/4 v5, 0x0

    .line 322
    goto/16 :goto_26

    .line 323
    .line 324
    :cond_8
    sget-object v13, LI0/p;->b:LI0/s;

    .line 325
    .line 326
    invoke-static {v4, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v13

    .line 330
    if-eqz v13, :cond_9

    .line 331
    .line 332
    const/4 v13, 0x1

    .line 333
    goto :goto_b

    .line 334
    :cond_9
    sget-object v13, LI0/p;->F:LI0/s;

    .line 335
    .line 336
    invoke-static {v4, v13}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v13

    .line 340
    :goto_b
    if-eqz v13, :cond_a

    .line 341
    .line 342
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 343
    .line 344
    .line 345
    move-result v1

    .line 346
    const/16 v4, 0x8

    .line 347
    .line 348
    const/16 v13, 0x800

    .line 349
    .line 350
    invoke-static {v0, v1, v13, v7, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    invoke-static {v0, v1, v13, v2, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 358
    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_a
    move-object/from16 v43, v8

    .line 362
    .line 363
    const/16 v13, 0x800

    .line 364
    .line 365
    sget-object v8, LI0/p;->c:LI0/s;

    .line 366
    .line 367
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v8

    .line 371
    if-eqz v8, :cond_b

    .line 372
    .line 373
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 374
    .line 375
    .line 376
    move-result v1

    .line 377
    const/16 v4, 0x8

    .line 378
    .line 379
    invoke-static {v0, v1, v13, v7, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    invoke-static {v0, v1, v13, v2, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 387
    .line 388
    .line 389
    :goto_c
    move-object v8, v2

    .line 390
    move-object v2, v5

    .line 391
    move-object/from16 v51, v7

    .line 392
    .line 393
    move-object/from16 v13, v39

    .line 394
    .line 395
    :goto_d
    const/4 v5, 0x0

    .line 396
    move v7, v3

    .line 397
    goto :goto_8

    .line 398
    :cond_b
    sget-object v8, LI0/p;->E:LI0/s;

    .line 399
    .line 400
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v13

    .line 404
    move/from16 v47, v13

    .line 405
    .line 406
    const/4 v13, 0x4

    .line 407
    if-eqz v47, :cond_18

    .line 408
    .line 409
    sget-object v1, LI0/p;->v:LI0/s;

    .line 410
    .line 411
    invoke-virtual {v11, v1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    if-nez v1, :cond_c

    .line 416
    .line 417
    move-object/from16 v1, v27

    .line 418
    .line 419
    :cond_c
    check-cast v1, LI0/f;

    .line 420
    .line 421
    if-nez v1, :cond_e

    .line 422
    .line 423
    :cond_d
    const/4 v1, 0x0

    .line 424
    goto :goto_e

    .line 425
    :cond_e
    iget v1, v1, LI0/f;->a:I

    .line 426
    .line 427
    if-ne v1, v13, :cond_d

    .line 428
    .line 429
    const/4 v1, 0x1

    .line 430
    :goto_e
    if-eqz v1, :cond_17

    .line 431
    .line 432
    invoke-virtual {v11, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    if-nez v1, :cond_f

    .line 437
    .line 438
    move-object/from16 v1, v27

    .line 439
    .line 440
    :cond_f
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 441
    .line 442
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    if-eqz v1, :cond_16

    .line 447
    .line 448
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 449
    .line 450
    .line 451
    move-result v1

    .line 452
    invoke-virtual {v0, v1, v13}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    new-instance v4, LI0/m;

    .line 457
    .line 458
    move-object/from16 v8, v40

    .line 459
    .line 460
    iget-object v12, v8, LI0/m;->a:Lc0/l;

    .line 461
    .line 462
    move-object/from16 v13, v39

    .line 463
    .line 464
    const/4 v8, 0x1

    .line 465
    invoke-direct {v4, v12, v8, v13, v6}, LI0/m;-><init>(Lc0/l;ZLB0/L;LI0/i;)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v4}, LI0/m;->i()LI0/i;

    .line 469
    .line 470
    .line 471
    move-result-object v12

    .line 472
    sget-object v8, LI0/p;->a:LI0/s;

    .line 473
    .line 474
    iget-object v12, v12, LI0/i;->q:Lr/G;

    .line 475
    .line 476
    invoke-virtual {v12, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v8

    .line 480
    if-nez v8, :cond_10

    .line 481
    .line 482
    move-object/from16 v8, v27

    .line 483
    .line 484
    :cond_10
    check-cast v8, Ljava/util/List;

    .line 485
    .line 486
    const/16 v12, 0x3e

    .line 487
    .line 488
    move-object/from16 v39, v4

    .line 489
    .line 490
    const-string v4, ","

    .line 491
    .line 492
    if-eqz v8, :cond_11

    .line 493
    .line 494
    invoke-static {v12, v4, v8}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    goto :goto_f

    .line 499
    :cond_11
    move-object/from16 v8, v27

    .line 500
    .line 501
    :goto_f
    invoke-virtual/range {v39 .. v39}, LI0/m;->i()LI0/i;

    .line 502
    .line 503
    .line 504
    move-result-object v12

    .line 505
    move-object/from16 v39, v13

    .line 506
    .line 507
    sget-object v13, LI0/p;->y:LI0/s;

    .line 508
    .line 509
    iget-object v12, v12, LI0/i;->q:Lr/G;

    .line 510
    .line 511
    invoke-virtual {v12, v13}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v12

    .line 515
    if-nez v12, :cond_12

    .line 516
    .line 517
    move-object/from16 v12, v27

    .line 518
    .line 519
    :cond_12
    check-cast v12, Ljava/util/List;

    .line 520
    .line 521
    if-eqz v12, :cond_13

    .line 522
    .line 523
    const/16 v13, 0x3e

    .line 524
    .line 525
    invoke-static {v13, v4, v12}, LY0/a;->a(ILjava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    goto :goto_10

    .line 530
    :cond_13
    move-object/from16 v4, v27

    .line 531
    .line 532
    :goto_10
    if-eqz v8, :cond_14

    .line 533
    .line 534
    invoke-virtual {v1, v8}, Landroid/view/accessibility/AccessibilityRecord;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 535
    .line 536
    .line 537
    :cond_14
    if-eqz v4, :cond_15

    .line 538
    .line 539
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v8

    .line 543
    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    :cond_15
    invoke-virtual {v0, v1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 547
    .line 548
    .line 549
    goto/16 :goto_c

    .line 550
    .line 551
    :cond_16
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 552
    .line 553
    .line 554
    move-result v1

    .line 555
    const/16 v4, 0x8

    .line 556
    .line 557
    const/16 v8, 0x800

    .line 558
    .line 559
    invoke-static {v0, v1, v8, v2, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 560
    .line 561
    .line 562
    goto/16 :goto_c

    .line 563
    .line 564
    :cond_17
    const/16 v4, 0x8

    .line 565
    .line 566
    const/16 v8, 0x800

    .line 567
    .line 568
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    invoke-static {v0, v1, v8, v7, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    invoke-static {v0, v1, v8, v2, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 580
    .line 581
    .line 582
    goto/16 :goto_c

    .line 583
    .line 584
    :cond_18
    move/from16 v36, v13

    .line 585
    .line 586
    move-object/from16 v13, v39

    .line 587
    .line 588
    sget-object v8, LI0/p;->a:LI0/s;

    .line 589
    .line 590
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v8

    .line 594
    if-eqz v8, :cond_19

    .line 595
    .line 596
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 597
    .line 598
    .line 599
    move-result v4

    .line 600
    invoke-static/range {v36 .. v36}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 601
    .line 602
    .line 603
    move-result-object v8

    .line 604
    const-string v12, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 605
    .line 606
    invoke-static {v1, v12}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    check-cast v1, Ljava/util/List;

    .line 610
    .line 611
    const/16 v12, 0x800

    .line 612
    .line 613
    invoke-virtual {v0, v4, v12, v8, v1}, LC0/I;->C(IILjava/lang/Integer;Ljava/util/List;)Z

    .line 614
    .line 615
    .line 616
    move-object v8, v2

    .line 617
    move-object v2, v5

    .line 618
    move-object/from16 v51, v7

    .line 619
    .line 620
    goto/16 :goto_d

    .line 621
    .line 622
    :cond_19
    sget-object v8, LI0/p;->C:LI0/s;

    .line 623
    .line 624
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v39

    .line 628
    const-wide v47, 0xffffffffL

    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    const/16 v49, 0x20

    .line 634
    .line 635
    const-string v50, ""

    .line 636
    .line 637
    if-eqz v39, :cond_2a

    .line 638
    .line 639
    sget-object v1, LI0/h;->j:LI0/s;

    .line 640
    .line 641
    invoke-virtual {v11, v1}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    if-eqz v1, :cond_29

    .line 646
    .line 647
    invoke-virtual {v5, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v1

    .line 651
    if-nez v1, :cond_1a

    .line 652
    .line 653
    move-object/from16 v1, v27

    .line 654
    .line 655
    :cond_1a
    check-cast v1, LL0/d;

    .line 656
    .line 657
    if-eqz v1, :cond_1b

    .line 658
    .line 659
    goto :goto_11

    .line 660
    :cond_1b
    move-object/from16 v1, v50

    .line 661
    .line 662
    :goto_11
    invoke-virtual {v11, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    if-nez v4, :cond_1c

    .line 667
    .line 668
    move-object/from16 v4, v27

    .line 669
    .line 670
    :cond_1c
    check-cast v4, LL0/d;

    .line 671
    .line 672
    if-eqz v4, :cond_1d

    .line 673
    .line 674
    goto :goto_12

    .line 675
    :cond_1d
    move-object/from16 v4, v50

    .line 676
    .line 677
    :goto_12
    invoke-static {v4}, LC0/I;->K(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 678
    .line 679
    .line 680
    move-result-object v8

    .line 681
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 682
    .line 683
    .line 684
    move-result v12

    .line 685
    move-object/from16 v39, v2

    .line 686
    .line 687
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 688
    .line 689
    .line 690
    move-result v2

    .line 691
    move/from16 v50, v2

    .line 692
    .line 693
    if-le v12, v2, :cond_1e

    .line 694
    .line 695
    goto :goto_13

    .line 696
    :cond_1e
    move v2, v12

    .line 697
    :goto_13
    move-object/from16 v51, v7

    .line 698
    .line 699
    const/4 v7, 0x0

    .line 700
    :goto_14
    move/from16 v52, v2

    .line 701
    .line 702
    if-ge v7, v2, :cond_20

    .line 703
    .line 704
    invoke-interface {v1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    move/from16 v53, v12

    .line 709
    .line 710
    invoke-interface {v4, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 711
    .line 712
    .line 713
    move-result v12

    .line 714
    if-eq v2, v12, :cond_1f

    .line 715
    .line 716
    goto :goto_15

    .line 717
    :cond_1f
    add-int/lit8 v7, v7, 0x1

    .line 718
    .line 719
    move/from16 v2, v52

    .line 720
    .line 721
    move/from16 v12, v53

    .line 722
    .line 723
    goto :goto_14

    .line 724
    :cond_20
    move/from16 v53, v12

    .line 725
    .line 726
    :goto_15
    const/4 v2, 0x0

    .line 727
    :goto_16
    sub-int v12, v52, v7

    .line 728
    .line 729
    if-ge v2, v12, :cond_22

    .line 730
    .line 731
    add-int/lit8 v12, v53, -0x1

    .line 732
    .line 733
    sub-int/2addr v12, v2

    .line 734
    invoke-interface {v1, v12}, Ljava/lang/CharSequence;->charAt(I)C

    .line 735
    .line 736
    .line 737
    move-result v12

    .line 738
    add-int/lit8 v54, v50, -0x1

    .line 739
    .line 740
    move/from16 v55, v2

    .line 741
    .line 742
    sub-int v2, v54, v55

    .line 743
    .line 744
    invoke-interface {v4, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    if-eq v12, v2, :cond_21

    .line 749
    .line 750
    goto :goto_17

    .line 751
    :cond_21
    add-int/lit8 v2, v55, 0x1

    .line 752
    .line 753
    goto :goto_16

    .line 754
    :cond_22
    move/from16 v55, v2

    .line 755
    .line 756
    :goto_17
    sub-int v12, v53, v55

    .line 757
    .line 758
    sub-int/2addr v12, v7

    .line 759
    sub-int v2, v50, v55

    .line 760
    .line 761
    sub-int/2addr v2, v7

    .line 762
    sget-object v4, LI0/p;->G:LI0/s;

    .line 763
    .line 764
    invoke-virtual {v5, v4}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 765
    .line 766
    .line 767
    move-result v52

    .line 768
    invoke-virtual {v11, v4}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    move/from16 v53, v4

    .line 773
    .line 774
    sget-object v4, LI0/p;->C:LI0/s;

    .line 775
    .line 776
    invoke-virtual {v5, v4}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    move-result v4

    .line 780
    if-eqz v4, :cond_23

    .line 781
    .line 782
    if-nez v52, :cond_23

    .line 783
    .line 784
    if-eqz v53, :cond_23

    .line 785
    .line 786
    const/16 v54, 0x1

    .line 787
    .line 788
    goto :goto_18

    .line 789
    :cond_23
    const/16 v54, 0x0

    .line 790
    .line 791
    :goto_18
    if-eqz v4, :cond_24

    .line 792
    .line 793
    if-eqz v52, :cond_24

    .line 794
    .line 795
    if-nez v53, :cond_24

    .line 796
    .line 797
    const/16 v52, 0x1

    .line 798
    .line 799
    goto :goto_19

    .line 800
    :cond_24
    const/16 v52, 0x0

    .line 801
    .line 802
    :goto_19
    if-nez v54, :cond_25

    .line 803
    .line 804
    if-eqz v52, :cond_26

    .line 805
    .line 806
    :cond_25
    move-object/from16 v53, v5

    .line 807
    .line 808
    goto :goto_1a

    .line 809
    :cond_26
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 810
    .line 811
    .line 812
    move-result v4

    .line 813
    move-object/from16 v53, v5

    .line 814
    .line 815
    const/16 v5, 0x10

    .line 816
    .line 817
    invoke-virtual {v0, v4, v5}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 818
    .line 819
    .line 820
    move-result-object v4

    .line 821
    invoke-virtual {v4, v7}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v4, v12}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v4, v2}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v4}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 834
    .line 835
    .line 836
    move-result-object v1

    .line 837
    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 838
    .line 839
    .line 840
    move v7, v3

    .line 841
    move-object/from16 v2, v39

    .line 842
    .line 843
    goto :goto_1b

    .line 844
    :goto_1a
    invoke-virtual {v0, v3}, LC0/I;->z(I)I

    .line 845
    .line 846
    .line 847
    move-result v1

    .line 848
    invoke-static/range {v50 .. v50}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 849
    .line 850
    .line 851
    move-result-object v4

    .line 852
    move v2, v3

    .line 853
    move-object/from16 v3, v39

    .line 854
    .line 855
    move v7, v2

    .line 856
    move-object v5, v8

    .line 857
    move-object/from16 v2, v39

    .line 858
    .line 859
    invoke-virtual/range {v0 .. v5}, LC0/I;->p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 860
    .line 861
    .line 862
    move-result-object v4

    .line 863
    :goto_1b
    const-string v1, "android.widget.EditText"

    .line 864
    .line 865
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0, v4}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 869
    .line 870
    .line 871
    if-nez v54, :cond_28

    .line 872
    .line 873
    if-eqz v52, :cond_27

    .line 874
    .line 875
    goto :goto_1d

    .line 876
    :cond_27
    move-object v8, v2

    .line 877
    :goto_1c
    move/from16 v3, v44

    .line 878
    .line 879
    move-object/from16 v2, v53

    .line 880
    .line 881
    goto/16 :goto_a

    .line 882
    .line 883
    :cond_28
    :goto_1d
    sget-object v1, LI0/p;->D:LI0/s;

    .line 884
    .line 885
    invoke-virtual {v6, v1}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    check-cast v1, LL0/E;

    .line 890
    .line 891
    move-object/from16 v39, v2

    .line 892
    .line 893
    iget-wide v1, v1, LL0/E;->a:J

    .line 894
    .line 895
    move-wide/from16 v54, v1

    .line 896
    .line 897
    shr-long v1, v54, v49

    .line 898
    .line 899
    long-to-int v1, v1

    .line 900
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 901
    .line 902
    .line 903
    and-long v1, v54, v47

    .line 904
    .line 905
    long-to-int v1, v1

    .line 906
    invoke-virtual {v4, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 907
    .line 908
    .line 909
    invoke-virtual {v0, v4}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 910
    .line 911
    .line 912
    :goto_1e
    move-object/from16 v8, v39

    .line 913
    .line 914
    goto :goto_1c

    .line 915
    :cond_29
    move-object/from16 v39, v2

    .line 916
    .line 917
    move-object/from16 v53, v5

    .line 918
    .line 919
    move-object/from16 v51, v7

    .line 920
    .line 921
    move v7, v3

    .line 922
    invoke-virtual {v0, v7}, LC0/I;->z(I)I

    .line 923
    .line 924
    .line 925
    move-result v1

    .line 926
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    const/16 v4, 0x8

    .line 931
    .line 932
    const/16 v8, 0x800

    .line 933
    .line 934
    invoke-static {v0, v1, v8, v2, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 935
    .line 936
    .line 937
    goto :goto_1e

    .line 938
    :cond_2a
    move-object/from16 v39, v2

    .line 939
    .line 940
    move-object/from16 v53, v5

    .line 941
    .line 942
    move-object/from16 v51, v7

    .line 943
    .line 944
    move v7, v3

    .line 945
    sget-object v2, LI0/p;->D:LI0/s;

    .line 946
    .line 947
    invoke-static {v4, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 948
    .line 949
    .line 950
    move-result v3

    .line 951
    if-eqz v3, :cond_2e

    .line 952
    .line 953
    invoke-virtual {v11, v8}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v1

    .line 957
    if-nez v1, :cond_2b

    .line 958
    .line 959
    move-object/from16 v1, v27

    .line 960
    .line 961
    :cond_2b
    check-cast v1, LL0/d;

    .line 962
    .line 963
    if-eqz v1, :cond_2d

    .line 964
    .line 965
    iget-object v1, v1, LL0/d;->r:Ljava/lang/String;

    .line 966
    .line 967
    if-nez v1, :cond_2c

    .line 968
    .line 969
    goto :goto_1f

    .line 970
    :cond_2c
    move-object/from16 v50, v1

    .line 971
    .line 972
    :cond_2d
    :goto_1f
    invoke-virtual {v6, v2}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, LL0/E;

    .line 977
    .line 978
    iget-wide v1, v1, LL0/E;->a:J

    .line 979
    .line 980
    move-wide v2, v1

    .line 981
    invoke-virtual {v0, v7}, LC0/I;->z(I)I

    .line 982
    .line 983
    .line 984
    move-result v1

    .line 985
    shr-long v4, v2, v49

    .line 986
    .line 987
    long-to-int v4, v4

    .line 988
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 989
    .line 990
    .line 991
    move-result-object v4

    .line 992
    and-long v2, v2, v47

    .line 993
    .line 994
    long-to-int v2, v2

    .line 995
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 996
    .line 997
    .line 998
    move-result-object v3

    .line 999
    invoke-virtual/range {v50 .. v50}, Ljava/lang/String;->length()I

    .line 1000
    .line 1001
    .line 1002
    move-result v2

    .line 1003
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    invoke-static/range {v50 .. v50}, LC0/I;->K(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v5

    .line 1011
    move-object v8, v4

    .line 1012
    move-object v4, v2

    .line 1013
    move-object v2, v8

    .line 1014
    move-object/from16 v8, v39

    .line 1015
    .line 1016
    invoke-virtual/range {v0 .. v5}, LC0/I;->p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v1

    .line 1020
    invoke-virtual {v0, v1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v0, v10}, LC0/I;->F(I)V

    .line 1024
    .line 1025
    .line 1026
    goto/16 :goto_1c

    .line 1027
    .line 1028
    :cond_2e
    move-object/from16 v8, v39

    .line 1029
    .line 1030
    move/from16 v3, v44

    .line 1031
    .line 1032
    move-object/from16 v2, v53

    .line 1033
    .line 1034
    invoke-static {v4, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v5

    .line 1038
    if-eqz v5, :cond_2f

    .line 1039
    .line 1040
    const/4 v5, 0x1

    .line 1041
    goto :goto_20

    .line 1042
    :cond_2f
    sget-object v5, LI0/p;->t:LI0/s;

    .line 1043
    .line 1044
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1045
    .line 1046
    .line 1047
    move-result v5

    .line 1048
    :goto_20
    if-eqz v5, :cond_33

    .line 1049
    .line 1050
    invoke-virtual {v0, v13}, LC0/I;->v(LB0/L;)V

    .line 1051
    .line 1052
    .line 1053
    invoke-static {v7, v9}, LC0/W;->e(ILjava/util/ArrayList;)LC0/U0;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v1

    .line 1057
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v11, v12}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v4

    .line 1064
    if-nez v4, :cond_30

    .line 1065
    .line 1066
    move-object/from16 v4, v27

    .line 1067
    .line 1068
    :cond_30
    check-cast v4, LI0/g;

    .line 1069
    .line 1070
    iput-object v4, v1, LC0/U0;->u:LI0/g;

    .line 1071
    .line 1072
    sget-object v4, LI0/p;->t:LI0/s;

    .line 1073
    .line 1074
    invoke-virtual {v11, v4}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    if-nez v4, :cond_31

    .line 1079
    .line 1080
    move-object/from16 v4, v27

    .line 1081
    .line 1082
    :cond_31
    check-cast v4, LI0/g;

    .line 1083
    .line 1084
    iput-object v4, v1, LC0/U0;->v:LI0/g;

    .line 1085
    .line 1086
    iget-object v4, v1, LC0/U0;->r:Ljava/util/List;

    .line 1087
    .line 1088
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v4

    .line 1092
    if-nez v4, :cond_32

    .line 1093
    .line 1094
    goto/16 :goto_a

    .line 1095
    .line 1096
    :cond_32
    iget-object v4, v0, LC0/I;->d:LC0/A;

    .line 1097
    .line 1098
    invoke-virtual {v4}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v4

    .line 1102
    new-instance v5, LB0/K;

    .line 1103
    .line 1104
    const/4 v12, 0x6

    .line 1105
    invoke-direct {v5, v12, v1, v0}, LB0/K;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1106
    .line 1107
    .line 1108
    iget-object v12, v0, LC0/I;->O:LC0/H;

    .line 1109
    .line 1110
    invoke-virtual {v4, v1, v12, v5}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_a

    .line 1114
    .line 1115
    :cond_33
    sget-object v5, LI0/p;->k:LI0/s;

    .line 1116
    .line 1117
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v5

    .line 1121
    if-eqz v5, :cond_35

    .line 1122
    .line 1123
    const-string v4, "null cannot be cast to non-null type kotlin.Boolean"

    .line 1124
    .line 1125
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    check-cast v1, Ljava/lang/Boolean;

    .line 1129
    .line 1130
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1131
    .line 1132
    .line 1133
    move-result v1

    .line 1134
    if-eqz v1, :cond_34

    .line 1135
    .line 1136
    invoke-virtual {v0, v10}, LC0/I;->z(I)I

    .line 1137
    .line 1138
    .line 1139
    move-result v1

    .line 1140
    const/16 v4, 0x8

    .line 1141
    .line 1142
    invoke-virtual {v0, v1, v4}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    invoke-virtual {v0, v1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 1147
    .line 1148
    .line 1149
    goto :goto_21

    .line 1150
    :cond_34
    const/16 v4, 0x8

    .line 1151
    .line 1152
    :goto_21
    invoke-virtual {v0, v10}, LC0/I;->z(I)I

    .line 1153
    .line 1154
    .line 1155
    move-result v1

    .line 1156
    const/16 v12, 0x800

    .line 1157
    .line 1158
    invoke-static {v0, v1, v12, v8, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 1159
    .line 1160
    .line 1161
    goto/16 :goto_a

    .line 1162
    .line 1163
    :cond_35
    sget-object v5, LI0/h;->v:LI0/s;

    .line 1164
    .line 1165
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1166
    .line 1167
    .line 1168
    move-result v12

    .line 1169
    if-eqz v12, :cond_3c

    .line 1170
    .line 1171
    invoke-virtual {v6, v5}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    check-cast v1, Ljava/util/List;

    .line 1176
    .line 1177
    invoke-virtual {v2, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v4

    .line 1181
    if-nez v4, :cond_36

    .line 1182
    .line 1183
    move-object/from16 v4, v27

    .line 1184
    .line 1185
    :cond_36
    check-cast v4, Ljava/util/List;

    .line 1186
    .line 1187
    if-eqz v4, :cond_3b

    .line 1188
    .line 1189
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 1190
    .line 1191
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1192
    .line 1193
    .line 1194
    move-object v12, v1

    .line 1195
    check-cast v12, Ljava/util/Collection;

    .line 1196
    .line 1197
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1198
    .line 1199
    .line 1200
    move-result v12

    .line 1201
    if-gtz v12, :cond_3a

    .line 1202
    .line 1203
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 1204
    .line 1205
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1206
    .line 1207
    .line 1208
    move-object v12, v4

    .line 1209
    check-cast v12, Ljava/util/Collection;

    .line 1210
    .line 1211
    invoke-interface {v12}, Ljava/util/Collection;->size()I

    .line 1212
    .line 1213
    .line 1214
    move-result v12

    .line 1215
    if-gtz v12, :cond_39

    .line 1216
    .line 1217
    invoke-interface {v5, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 1218
    .line 1219
    .line 1220
    move-result v4

    .line 1221
    if-eqz v4, :cond_38

    .line 1222
    .line 1223
    invoke-interface {v1, v5}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 1224
    .line 1225
    .line 1226
    move-result v1

    .line 1227
    if-nez v1, :cond_37

    .line 1228
    .line 1229
    goto :goto_22

    .line 1230
    :cond_37
    const/16 v37, 0x0

    .line 1231
    .line 1232
    goto/16 :goto_26

    .line 1233
    .line 1234
    :cond_38
    :goto_22
    const/16 v37, 0x1

    .line 1235
    .line 1236
    goto :goto_26

    .line 1237
    :cond_39
    const/4 v5, 0x0

    .line 1238
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v1

    .line 1242
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1243
    .line 1244
    .line 1245
    new-instance v1, Ljava/lang/ClassCastException;

    .line 1246
    .line 1247
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1248
    .line 1249
    .line 1250
    throw v1

    .line 1251
    :cond_3a
    const/4 v5, 0x0

    .line 1252
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v1

    .line 1256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    new-instance v1, Ljava/lang/ClassCastException;

    .line 1260
    .line 1261
    invoke-direct {v1}, Ljava/lang/ClassCastException;-><init>()V

    .line 1262
    .line 1263
    .line 1264
    throw v1

    .line 1265
    :cond_3b
    const/4 v5, 0x0

    .line 1266
    check-cast v1, Ljava/util/Collection;

    .line 1267
    .line 1268
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1269
    .line 1270
    .line 1271
    move-result v1

    .line 1272
    if-nez v1, :cond_43

    .line 1273
    .line 1274
    goto :goto_22

    .line 1275
    :cond_3c
    const/4 v5, 0x0

    .line 1276
    instance-of v12, v1, LI0/a;

    .line 1277
    .line 1278
    if-eqz v12, :cond_38

    .line 1279
    .line 1280
    check-cast v1, LI0/a;

    .line 1281
    .line 1282
    invoke-virtual {v2, v4}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v4

    .line 1286
    if-nez v4, :cond_3d

    .line 1287
    .line 1288
    move-object/from16 v4, v27

    .line 1289
    .line 1290
    :cond_3d
    sget-object v12, LC0/M;->a:[Ljava/util/Comparator;

    .line 1291
    .line 1292
    if-ne v1, v4, :cond_3e

    .line 1293
    .line 1294
    goto :goto_24

    .line 1295
    :cond_3e
    instance-of v12, v4, LI0/a;

    .line 1296
    .line 1297
    if-nez v12, :cond_3f

    .line 1298
    .line 1299
    goto :goto_23

    .line 1300
    :cond_3f
    iget-object v12, v1, LI0/a;->a:Ljava/lang/String;

    .line 1301
    .line 1302
    check-cast v4, LI0/a;

    .line 1303
    .line 1304
    iget-object v5, v4, LI0/a;->a:Ljava/lang/String;

    .line 1305
    .line 1306
    iget-object v4, v4, LI0/a;->b:Lm5/e;

    .line 1307
    .line 1308
    invoke-static {v12, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1309
    .line 1310
    .line 1311
    move-result v5

    .line 1312
    if-nez v5, :cond_40

    .line 1313
    .line 1314
    goto :goto_23

    .line 1315
    :cond_40
    iget-object v1, v1, LI0/a;->b:Lm5/e;

    .line 1316
    .line 1317
    if-nez v1, :cond_41

    .line 1318
    .line 1319
    if-eqz v4, :cond_41

    .line 1320
    .line 1321
    goto :goto_23

    .line 1322
    :cond_41
    if-eqz v1, :cond_42

    .line 1323
    .line 1324
    if-nez v4, :cond_42

    .line 1325
    .line 1326
    :goto_23
    const/4 v1, 0x0

    .line 1327
    goto :goto_25

    .line 1328
    :cond_42
    :goto_24
    const/4 v1, 0x1

    .line 1329
    :goto_25
    if-nez v1, :cond_37

    .line 1330
    .line 1331
    goto :goto_22

    .line 1332
    :cond_43
    :goto_26
    const/16 v4, 0x8

    .line 1333
    .line 1334
    goto :goto_27

    .line 1335
    :cond_44
    move-object/from16 v42, v4

    .line 1336
    .line 1337
    move-object/from16 v51, v7

    .line 1338
    .line 1339
    move-object/from16 v43, v8

    .line 1340
    .line 1341
    move-wide/from16 v45, v12

    .line 1342
    .line 1343
    move-object/from16 v13, v39

    .line 1344
    .line 1345
    move-object v8, v2

    .line 1346
    move v7, v3

    .line 1347
    move-object v2, v5

    .line 1348
    move v3, v1

    .line 1349
    goto :goto_26

    .line 1350
    :goto_27
    shr-long v44, v45, v4

    .line 1351
    .line 1352
    add-int/lit8 v15, v15, 0x1

    .line 1353
    .line 1354
    move-object v5, v2

    .line 1355
    move v1, v3

    .line 1356
    move/from16 v28, v4

    .line 1357
    .line 1358
    move v3, v7

    .line 1359
    move-object v2, v8

    .line 1360
    move-object/from16 v39, v13

    .line 1361
    .line 1362
    move-object/from16 v4, v42

    .line 1363
    .line 1364
    move-object/from16 v8, v43

    .line 1365
    .line 1366
    move-wide/from16 v12, v44

    .line 1367
    .line 1368
    move-object/from16 v7, v51

    .line 1369
    .line 1370
    goto/16 :goto_4

    .line 1371
    .line 1372
    :cond_45
    move-object/from16 v42, v4

    .line 1373
    .line 1374
    move-object/from16 v51, v7

    .line 1375
    .line 1376
    move-object/from16 v43, v8

    .line 1377
    .line 1378
    move/from16 v4, v28

    .line 1379
    .line 1380
    move-object/from16 v13, v39

    .line 1381
    .line 1382
    move-object v8, v2

    .line 1383
    move v7, v3

    .line 1384
    move-object v2, v5

    .line 1385
    move v3, v1

    .line 1386
    if-ne v14, v4, :cond_48

    .line 1387
    .line 1388
    :goto_28
    move/from16 v1, v41

    .line 1389
    .line 1390
    goto :goto_29

    .line 1391
    :cond_46
    move-object/from16 v42, v4

    .line 1392
    .line 1393
    move-object/from16 v51, v7

    .line 1394
    .line 1395
    move-object/from16 v43, v8

    .line 1396
    .line 1397
    move-object/from16 v13, v39

    .line 1398
    .line 1399
    move-object v8, v2

    .line 1400
    move v7, v3

    .line 1401
    move-object v2, v5

    .line 1402
    move v3, v1

    .line 1403
    goto :goto_28

    .line 1404
    :goto_29
    if-eq v1, v3, :cond_48

    .line 1405
    .line 1406
    add-int/lit8 v15, v1, 0x1

    .line 1407
    .line 1408
    move-object v5, v2

    .line 1409
    move v1, v3

    .line 1410
    move v3, v7

    .line 1411
    move-object v2, v8

    .line 1412
    move-object/from16 v39, v13

    .line 1413
    .line 1414
    move-object/from16 v14, v40

    .line 1415
    .line 1416
    move-object/from16 v4, v42

    .line 1417
    .line 1418
    move-object/from16 v8, v43

    .line 1419
    .line 1420
    move-object/from16 v7, v51

    .line 1421
    .line 1422
    const/16 v28, 0x8

    .line 1423
    .line 1424
    goto/16 :goto_3

    .line 1425
    .line 1426
    :cond_47
    move-object/from16 v42, v4

    .line 1427
    .line 1428
    move-object/from16 v51, v7

    .line 1429
    .line 1430
    move-object/from16 v43, v8

    .line 1431
    .line 1432
    move/from16 v38, v13

    .line 1433
    .line 1434
    move-object/from16 v40, v14

    .line 1435
    .line 1436
    move-object v8, v2

    .line 1437
    move v7, v3

    .line 1438
    const/16 v37, 0x0

    .line 1439
    .line 1440
    :cond_48
    if-nez v37, :cond_4b

    .line 1441
    .line 1442
    sget-object v1, LC0/M;->a:[Ljava/util/Comparator;

    .line 1443
    .line 1444
    invoke-virtual/range {v42 .. v42}, LI0/i;->iterator()Ljava/util/Iterator;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v1

    .line 1448
    :cond_49
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1449
    .line 1450
    .line 1451
    move-result v2

    .line 1452
    if-eqz v2, :cond_4a

    .line 1453
    .line 1454
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v2

    .line 1458
    check-cast v2, Ljava/util/Map$Entry;

    .line 1459
    .line 1460
    invoke-virtual/range {v40 .. v40}, LI0/m;->i()LI0/i;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v3

    .line 1464
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    check-cast v2, LI0/s;

    .line 1469
    .line 1470
    iget-object v3, v3, LI0/i;->q:Lr/G;

    .line 1471
    .line 1472
    invoke-virtual {v3, v2}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 1473
    .line 1474
    .line 1475
    move-result v2

    .line 1476
    if-nez v2, :cond_49

    .line 1477
    .line 1478
    const/4 v15, 0x1

    .line 1479
    goto :goto_2a

    .line 1480
    :cond_4a
    const/4 v15, 0x0

    .line 1481
    :goto_2a
    move/from16 v37, v15

    .line 1482
    .line 1483
    :cond_4b
    if-eqz v37, :cond_4c

    .line 1484
    .line 1485
    invoke-virtual {v0, v7}, LC0/I;->z(I)I

    .line 1486
    .line 1487
    .line 1488
    move-result v1

    .line 1489
    const/16 v4, 0x8

    .line 1490
    .line 1491
    const/16 v12, 0x800

    .line 1492
    .line 1493
    invoke-static {v0, v1, v12, v8, v4}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 1494
    .line 1495
    .line 1496
    goto :goto_2c

    .line 1497
    :cond_4c
    const/16 v4, 0x8

    .line 1498
    .line 1499
    goto :goto_2c

    .line 1500
    :cond_4d
    const-string v1, "no value for specified key"

    .line 1501
    .line 1502
    invoke-static {v1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    throw v1

    .line 1507
    :cond_4e
    :goto_2b
    move/from16 v34, v1

    .line 1508
    .line 1509
    move-object/from16 v51, v7

    .line 1510
    .line 1511
    move-object/from16 v43, v8

    .line 1512
    .line 1513
    move-object/from16 v29, v10

    .line 1514
    .line 1515
    move-object/from16 v30, v11

    .line 1516
    .line 1517
    move v4, v12

    .line 1518
    move/from16 v38, v13

    .line 1519
    .line 1520
    move/from16 v31, v15

    .line 1521
    .line 1522
    move-object v8, v2

    .line 1523
    :goto_2c
    shr-long v21, v21, v4

    .line 1524
    .line 1525
    add-int/lit8 v1, v34, 0x1

    .line 1526
    .line 1527
    move-object/from16 v6, p1

    .line 1528
    .line 1529
    move v12, v4

    .line 1530
    move-object v2, v8

    .line 1531
    move-object/from16 v10, v29

    .line 1532
    .line 1533
    move-object/from16 v11, v30

    .line 1534
    .line 1535
    move/from16 v15, v31

    .line 1536
    .line 1537
    move/from16 v13, v38

    .line 1538
    .line 1539
    move-object/from16 v8, v43

    .line 1540
    .line 1541
    move-object/from16 v7, v51

    .line 1542
    .line 1543
    const/4 v14, 0x0

    .line 1544
    goto/16 :goto_1

    .line 1545
    .line 1546
    :cond_4f
    move-object/from16 v51, v7

    .line 1547
    .line 1548
    move-object/from16 v43, v8

    .line 1549
    .line 1550
    move-object/from16 v29, v10

    .line 1551
    .line 1552
    move-object/from16 v30, v11

    .line 1553
    .line 1554
    move v4, v12

    .line 1555
    move v12, v13

    .line 1556
    move/from16 v31, v15

    .line 1557
    .line 1558
    move-object v8, v2

    .line 1559
    if-ne v12, v4, :cond_51

    .line 1560
    .line 1561
    move/from16 v14, v31

    .line 1562
    .line 1563
    :goto_2d
    move/from16 v1, v17

    .line 1564
    .line 1565
    goto :goto_2e

    .line 1566
    :cond_50
    move-object/from16 v51, v7

    .line 1567
    .line 1568
    move-object/from16 v43, v8

    .line 1569
    .line 1570
    move-object/from16 v29, v10

    .line 1571
    .line 1572
    move-object/from16 v30, v11

    .line 1573
    .line 1574
    move-object v8, v2

    .line 1575
    move v14, v15

    .line 1576
    goto :goto_2d

    .line 1577
    :goto_2e
    if-eq v14, v1, :cond_51

    .line 1578
    .line 1579
    add-int/lit8 v15, v14, 0x1

    .line 1580
    .line 1581
    move-object/from16 v6, p1

    .line 1582
    .line 1583
    move v13, v1

    .line 1584
    move-object v2, v8

    .line 1585
    move/from16 v12, v16

    .line 1586
    .line 1587
    move-object/from16 v10, v29

    .line 1588
    .line 1589
    move-object/from16 v11, v30

    .line 1590
    .line 1591
    move-object/from16 v8, v43

    .line 1592
    .line 1593
    move-object/from16 v7, v51

    .line 1594
    .line 1595
    const/4 v14, 0x0

    .line 1596
    goto/16 :goto_0

    .line 1597
    .line 1598
    :cond_51
    return-void
.end method

.method public final H(LB0/L;Lr/w;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, LB0/L;->F()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LC0/I;->d:LC0/A;

    .line 10
    .line 11
    invoke-virtual {v0}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LC0/k0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_1
    iget-object v0, p1, LB0/L;->U:LB0/g0;

    .line 28
    .line 29
    const/16 v1, 0x8

    .line 30
    .line 31
    invoke-virtual {v0, v1}, LB0/g0;->d(I)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    if-eqz p1, :cond_4

    .line 44
    .line 45
    iget-object v0, p1, LB0/L;->U:LB0/g0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, LB0/g0;->d(I)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    goto :goto_0

    .line 59
    :cond_4
    move-object p1, v2

    .line 60
    :goto_1
    if-eqz p1, :cond_a

    .line 61
    .line 62
    invoke-virtual {p1}, LB0/L;->u()LI0/i;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_5

    .line 67
    .line 68
    goto :goto_4

    .line 69
    :cond_5
    iget-boolean v0, v0, LI0/i;->s:Z

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_2
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-virtual {v0}, LB0/L;->u()LI0/i;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    iget-boolean v4, v4, LI0/i;->s:Z

    .line 87
    .line 88
    if-ne v4, v3, :cond_6

    .line 89
    .line 90
    move-object v2, v0

    .line 91
    goto :goto_3

    .line 92
    :cond_6
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    .line 98
    .line 99
    move-object p1, v2

    .line 100
    :cond_8
    iget p1, p1, LB0/L;->r:I

    .line 101
    .line 102
    invoke-virtual {p2, p1}, Lr/w;->a(I)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-nez p2, :cond_9

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_9
    invoke-virtual {p0, p1}, LC0/I;->z(I)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    const/16 p2, 0x800

    .line 114
    .line 115
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {p0, p1, p2, v0, v1}, LC0/I;->D(LC0/I;IILjava/lang/Integer;I)V

    .line 120
    .line 121
    .line 122
    :cond_a
    :goto_4
    return-void
.end method

.method public final I(LB0/L;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LB0/L;->F()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, LC0/I;->d:LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, LC0/A;->getAndroidViewsHandler$ui_release()LC0/k0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, LC0/k0;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget p1, p1, LB0/L;->r:I

    .line 26
    .line 27
    iget-object v0, p0, LC0/I;->s:Lr/v;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lr/k;->b(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, LI0/g;

    .line 34
    .line 35
    iget-object v1, p0, LC0/I;->t:Lr/v;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Lr/k;->b(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, LI0/g;

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    :goto_0
    return-void

    .line 48
    :cond_2
    const/16 v2, 0x1000

    .line 49
    .line 50
    invoke-virtual {p0, p1, v2}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    iget-object v2, v0, LI0/g;->a:LE/Q;

    .line 57
    .line 58
    invoke-virtual {v2}, LE/Q;->invoke()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    float-to-int v2, v2

    .line 69
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, LI0/g;->b:LE/Q;

    .line 73
    .line 74
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Ljava/lang/Number;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    float-to-int v0, v0

    .line 85
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 86
    .line 87
    .line 88
    :cond_3
    if-eqz v1, :cond_4

    .line 89
    .line 90
    iget-object v0, v1, LI0/g;->a:LE/Q;

    .line 91
    .line 92
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    float-to-int v0, v0

    .line 103
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 104
    .line 105
    .line 106
    iget-object v0, v1, LI0/g;->b:LE/Q;

    .line 107
    .line 108
    invoke-virtual {v0}, LE/Q;->invoke()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Ljava/lang/Number;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    float-to-int v0, v0

    .line 119
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 120
    .line 121
    .line 122
    :cond_4
    invoke-virtual {p0, p1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final J(LI0/m;IIZ)Z
    .locals 10

    .line 1
    iget-object v0, p1, LI0/m;->d:LI0/i;

    .line 2
    .line 3
    iget v1, p1, LI0/m;->g:I

    .line 4
    .line 5
    sget-object v2, LI0/h;->i:LI0/s;

    .line 6
    .line 7
    iget-object v0, v0, LI0/i;->q:Lr/G;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, LC0/M;->a(LI0/m;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p1, p1, LI0/m;->d:LI0/i;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, LI0/a;

    .line 29
    .line 30
    iget-object p1, p1, LI0/a;->b:Lm5/e;

    .line 31
    .line 32
    check-cast p1, LB5/f;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    invoke-interface {p1, p2, p3, p4}, LB5/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    return p1

    .line 59
    :cond_0
    if-ne p2, p3, :cond_1

    .line 60
    .line 61
    iget p4, p0, LC0/I;->w:I

    .line 62
    .line 63
    if-ne p3, p4, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-static {p1}, LC0/I;->t(LI0/m;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    if-nez v9, :cond_3

    .line 71
    .line 72
    :cond_2
    :goto_0
    return v3

    .line 73
    :cond_3
    if-ltz p2, :cond_4

    .line 74
    .line 75
    if-ne p2, p3, :cond_4

    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-gt p3, p1, :cond_4

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    const/4 p2, -0x1

    .line 85
    :goto_1
    iput p2, p0, LC0/I;->w:I

    .line 86
    .line 87
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    const/4 p2, 0x1

    .line 92
    if-lez p1, :cond_5

    .line 93
    .line 94
    move v3, p2

    .line 95
    :cond_5
    invoke-virtual {p0, v1}, LC0/I;->z(I)I

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    const/4 p1, 0x0

    .line 100
    if-eqz v3, :cond_6

    .line 101
    .line 102
    iget p3, p0, LC0/I;->w:I

    .line 103
    .line 104
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    move-object v6, p3

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move-object v6, p1

    .line 111
    :goto_2
    if-eqz v3, :cond_7

    .line 112
    .line 113
    iget p3, p0, LC0/I;->w:I

    .line 114
    .line 115
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    move-object v7, p3

    .line 120
    goto :goto_3

    .line 121
    :cond_7
    move-object v7, p1

    .line 122
    :goto_3
    if-eqz v3, :cond_8

    .line 123
    .line 124
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :cond_8
    move-object v4, p0

    .line 133
    move-object v8, p1

    .line 134
    invoke-virtual/range {v4 .. v9}, LC0/I;->p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p0, p1}, LC0/I;->B(Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v1}, LC0/I;->F(I)V

    .line 142
    .line 143
    .line 144
    return p2
.end method

.method public final L()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lr/w;

    .line 4
    .line 5
    invoke-direct {v1}, Lr/w;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, LC0/I;->D:Lr/w;

    .line 9
    .line 10
    iget-object v3, v2, Lr/w;->b:[I

    .line 11
    .line 12
    iget-object v4, v2, Lr/w;->a:[J

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    add-int/lit8 v5, v5, -0x2

    .line 16
    .line 17
    iget-object v6, v0, LC0/I;->J:Lr/v;

    .line 18
    .line 19
    const/16 v14, 0x8

    .line 20
    .line 21
    if-ltz v5, :cond_8

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const-wide/16 v16, 0x80

    .line 25
    .line 26
    const-wide/16 v18, 0xff

    .line 27
    .line 28
    :goto_0
    aget-wide v9, v4, v7

    .line 29
    .line 30
    const/4 v8, 0x7

    .line 31
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    not-long v11, v9

    .line 37
    shl-long/2addr v11, v8

    .line 38
    and-long/2addr v11, v9

    .line 39
    and-long v11, v11, v20

    .line 40
    .line 41
    cmp-long v11, v11, v20

    .line 42
    .line 43
    if-eqz v11, :cond_7

    .line 44
    .line 45
    sub-int v11, v7, v5

    .line 46
    .line 47
    not-int v11, v11

    .line 48
    ushr-int/lit8 v11, v11, 0x1f

    .line 49
    .line 50
    rsub-int/lit8 v11, v11, 0x8

    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_1
    if-ge v12, v11, :cond_6

    .line 54
    .line 55
    and-long v22, v9, v18

    .line 56
    .line 57
    cmp-long v13, v22, v16

    .line 58
    .line 59
    if-gez v13, :cond_4

    .line 60
    .line 61
    shl-int/lit8 v13, v7, 0x3

    .line 62
    .line 63
    add-int/2addr v13, v12

    .line 64
    aget v13, v3, v13

    .line 65
    .line 66
    move/from16 v22, v8

    .line 67
    .line 68
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8, v13}, Lr/k;->b(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, LC0/W0;

    .line 77
    .line 78
    const/16 v23, 0x0

    .line 79
    .line 80
    if-eqz v8, :cond_0

    .line 81
    .line 82
    iget-object v8, v8, LC0/W0;->a:LI0/m;

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_0
    move-object/from16 v8, v23

    .line 86
    .line 87
    :goto_2
    if-eqz v8, :cond_1

    .line 88
    .line 89
    iget-object v8, v8, LI0/m;->d:LI0/i;

    .line 90
    .line 91
    sget-object v15, LI0/p;->d:LI0/s;

    .line 92
    .line 93
    iget-object v8, v8, LI0/i;->q:Lr/G;

    .line 94
    .line 95
    invoke-virtual {v8, v15}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-nez v8, :cond_5

    .line 100
    .line 101
    :cond_1
    invoke-virtual {v1, v13}, Lr/w;->a(I)Z

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, v13}, Lr/k;->b(I)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, LC0/V0;

    .line 109
    .line 110
    if-eqz v8, :cond_3

    .line 111
    .line 112
    iget-object v8, v8, LC0/V0;->a:LI0/i;

    .line 113
    .line 114
    sget-object v15, LI0/p;->d:LI0/s;

    .line 115
    .line 116
    iget-object v8, v8, LI0/i;->q:Lr/G;

    .line 117
    .line 118
    invoke-virtual {v8, v15}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    if-nez v8, :cond_2

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_2
    move-object/from16 v23, v8

    .line 126
    .line 127
    :goto_3
    check-cast v23, Ljava/lang/String;

    .line 128
    .line 129
    :cond_3
    move-object/from16 v8, v23

    .line 130
    .line 131
    const/16 v15, 0x20

    .line 132
    .line 133
    invoke-virtual {v0, v8, v13, v15}, LC0/I;->E(Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    move/from16 v22, v8

    .line 138
    .line 139
    :cond_5
    :goto_4
    shr-long/2addr v9, v14

    .line 140
    add-int/lit8 v12, v12, 0x1

    .line 141
    .line 142
    move/from16 v8, v22

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_6
    move/from16 v22, v8

    .line 146
    .line 147
    if-ne v11, v14, :cond_9

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move/from16 v22, v8

    .line 151
    .line 152
    :goto_5
    if-eq v7, v5, :cond_9

    .line 153
    .line 154
    add-int/lit8 v7, v7, 0x1

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_8
    const-wide/16 v16, 0x80

    .line 159
    .line 160
    const-wide/16 v18, 0xff

    .line 161
    .line 162
    const-wide v20, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    const/16 v22, 0x7

    .line 168
    .line 169
    :cond_9
    iget-object v3, v1, Lr/w;->b:[I

    .line 170
    .line 171
    iget-object v1, v1, Lr/w;->a:[J

    .line 172
    .line 173
    array-length v4, v1

    .line 174
    add-int/lit8 v4, v4, -0x2

    .line 175
    .line 176
    if-ltz v4, :cond_11

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    :goto_6
    aget-wide v7, v1, v5

    .line 180
    .line 181
    not-long v9, v7

    .line 182
    shl-long v9, v9, v22

    .line 183
    .line 184
    and-long/2addr v9, v7

    .line 185
    and-long v9, v9, v20

    .line 186
    .line 187
    cmp-long v9, v9, v20

    .line 188
    .line 189
    if-eqz v9, :cond_10

    .line 190
    .line 191
    sub-int v9, v5, v4

    .line 192
    .line 193
    not-int v9, v9

    .line 194
    ushr-int/lit8 v9, v9, 0x1f

    .line 195
    .line 196
    rsub-int/lit8 v9, v9, 0x8

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    :goto_7
    if-ge v10, v9, :cond_f

    .line 200
    .line 201
    and-long v11, v7, v18

    .line 202
    .line 203
    cmp-long v11, v11, v16

    .line 204
    .line 205
    if-gez v11, :cond_d

    .line 206
    .line 207
    shl-int/lit8 v11, v5, 0x3

    .line 208
    .line 209
    add-int/2addr v11, v10

    .line 210
    aget v11, v3, v11

    .line 211
    .line 212
    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    .line 213
    .line 214
    .line 215
    move-result v12

    .line 216
    const v13, -0x3361d2af    # -8.2930312E7f

    .line 217
    .line 218
    .line 219
    mul-int/2addr v12, v13

    .line 220
    shl-int/lit8 v13, v12, 0x10

    .line 221
    .line 222
    xor-int/2addr v12, v13

    .line 223
    and-int/lit8 v13, v12, 0x7f

    .line 224
    .line 225
    iget v15, v2, Lr/w;->c:I

    .line 226
    .line 227
    ushr-int/lit8 v12, v12, 0x7

    .line 228
    .line 229
    and-int/2addr v12, v15

    .line 230
    move/from16 v24, v14

    .line 231
    .line 232
    const/16 v23, 0x0

    .line 233
    .line 234
    :goto_8
    iget-object v14, v2, Lr/w;->a:[J

    .line 235
    .line 236
    shr-int/lit8 v25, v12, 0x3

    .line 237
    .line 238
    and-int/lit8 v26, v12, 0x7

    .line 239
    .line 240
    move-object/from16 v27, v1

    .line 241
    .line 242
    shl-int/lit8 v1, v26, 0x3

    .line 243
    .line 244
    aget-wide v28, v14, v25

    .line 245
    .line 246
    ushr-long v28, v28, v1

    .line 247
    .line 248
    add-int/lit8 v25, v25, 0x1

    .line 249
    .line 250
    aget-wide v25, v14, v25

    .line 251
    .line 252
    rsub-int/lit8 v14, v1, 0x40

    .line 253
    .line 254
    shl-long v25, v25, v14

    .line 255
    .line 256
    move-wide/from16 v30, v7

    .line 257
    .line 258
    int-to-long v7, v1

    .line 259
    neg-long v7, v7

    .line 260
    const/16 v1, 0x3f

    .line 261
    .line 262
    shr-long/2addr v7, v1

    .line 263
    and-long v7, v25, v7

    .line 264
    .line 265
    or-long v7, v28, v7

    .line 266
    .line 267
    move v1, v15

    .line 268
    int-to-long v14, v13

    .line 269
    const-wide v25, 0x101010101010101L

    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    mul-long v14, v14, v25

    .line 275
    .line 276
    xor-long/2addr v14, v7

    .line 277
    sub-long v25, v14, v25

    .line 278
    .line 279
    not-long v14, v14

    .line 280
    and-long v14, v25, v14

    .line 281
    .line 282
    and-long v14, v14, v20

    .line 283
    .line 284
    :goto_9
    const-wide/16 v25, 0x0

    .line 285
    .line 286
    cmp-long v28, v14, v25

    .line 287
    .line 288
    if-eqz v28, :cond_b

    .line 289
    .line 290
    invoke-static {v14, v15}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 291
    .line 292
    .line 293
    move-result v25

    .line 294
    shr-int/lit8 v25, v25, 0x3

    .line 295
    .line 296
    add-int v25, v12, v25

    .line 297
    .line 298
    and-int v25, v25, v1

    .line 299
    .line 300
    move/from16 v28, v1

    .line 301
    .line 302
    iget-object v1, v2, Lr/w;->b:[I

    .line 303
    .line 304
    aget v1, v1, v25

    .line 305
    .line 306
    if-ne v1, v11, :cond_a

    .line 307
    .line 308
    :goto_a
    move/from16 v1, v25

    .line 309
    .line 310
    goto :goto_b

    .line 311
    :cond_a
    const-wide/16 v25, 0x1

    .line 312
    .line 313
    sub-long v25, v14, v25

    .line 314
    .line 315
    and-long v14, v14, v25

    .line 316
    .line 317
    move/from16 v1, v28

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_b
    move/from16 v28, v1

    .line 321
    .line 322
    not-long v14, v7

    .line 323
    const/4 v1, 0x6

    .line 324
    shl-long/2addr v14, v1

    .line 325
    and-long/2addr v7, v14

    .line 326
    and-long v7, v7, v20

    .line 327
    .line 328
    cmp-long v1, v7, v25

    .line 329
    .line 330
    if-eqz v1, :cond_c

    .line 331
    .line 332
    const/16 v25, -0x1

    .line 333
    .line 334
    goto :goto_a

    .line 335
    :goto_b
    if-ltz v1, :cond_e

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Lr/w;->f(I)V

    .line 338
    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_c
    add-int/lit8 v23, v23, 0x8

    .line 342
    .line 343
    add-int v12, v12, v23

    .line 344
    .line 345
    and-int v12, v12, v28

    .line 346
    .line 347
    move-object/from16 v1, v27

    .line 348
    .line 349
    move/from16 v15, v28

    .line 350
    .line 351
    move-wide/from16 v7, v30

    .line 352
    .line 353
    goto :goto_8

    .line 354
    :cond_d
    move-object/from16 v27, v1

    .line 355
    .line 356
    move-wide/from16 v30, v7

    .line 357
    .line 358
    move/from16 v24, v14

    .line 359
    .line 360
    :cond_e
    :goto_c
    shr-long v7, v30, v24

    .line 361
    .line 362
    add-int/lit8 v10, v10, 0x1

    .line 363
    .line 364
    move/from16 v14, v24

    .line 365
    .line 366
    move-object/from16 v1, v27

    .line 367
    .line 368
    goto/16 :goto_7

    .line 369
    .line 370
    :cond_f
    move-object/from16 v27, v1

    .line 371
    .line 372
    move v1, v14

    .line 373
    if-ne v9, v1, :cond_11

    .line 374
    .line 375
    goto :goto_d

    .line 376
    :cond_10
    move-object/from16 v27, v1

    .line 377
    .line 378
    :goto_d
    if-eq v5, v4, :cond_11

    .line 379
    .line 380
    add-int/lit8 v5, v5, 0x1

    .line 381
    .line 382
    move-object/from16 v1, v27

    .line 383
    .line 384
    const/16 v14, 0x8

    .line 385
    .line 386
    goto/16 :goto_6

    .line 387
    .line 388
    :cond_11
    invoke-virtual {v6}, Lr/v;->c()V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-object v3, v1, Lr/k;->b:[I

    .line 396
    .line 397
    iget-object v4, v1, Lr/k;->c:[Ljava/lang/Object;

    .line 398
    .line 399
    iget-object v1, v1, Lr/k;->a:[J

    .line 400
    .line 401
    array-length v5, v1

    .line 402
    add-int/lit8 v5, v5, -0x2

    .line 403
    .line 404
    if-ltz v5, :cond_16

    .line 405
    .line 406
    const/4 v7, 0x0

    .line 407
    :goto_e
    aget-wide v8, v1, v7

    .line 408
    .line 409
    not-long v10, v8

    .line 410
    shl-long v10, v10, v22

    .line 411
    .line 412
    and-long/2addr v10, v8

    .line 413
    and-long v10, v10, v20

    .line 414
    .line 415
    cmp-long v10, v10, v20

    .line 416
    .line 417
    if-eqz v10, :cond_15

    .line 418
    .line 419
    sub-int v10, v7, v5

    .line 420
    .line 421
    not-int v10, v10

    .line 422
    ushr-int/lit8 v10, v10, 0x1f

    .line 423
    .line 424
    const/16 v24, 0x8

    .line 425
    .line 426
    rsub-int/lit8 v14, v10, 0x8

    .line 427
    .line 428
    const/4 v10, 0x0

    .line 429
    :goto_f
    if-ge v10, v14, :cond_14

    .line 430
    .line 431
    and-long v11, v8, v18

    .line 432
    .line 433
    cmp-long v11, v11, v16

    .line 434
    .line 435
    if-gez v11, :cond_13

    .line 436
    .line 437
    shl-int/lit8 v11, v7, 0x3

    .line 438
    .line 439
    add-int/2addr v11, v10

    .line 440
    aget v12, v3, v11

    .line 441
    .line 442
    aget-object v11, v4, v11

    .line 443
    .line 444
    check-cast v11, LC0/W0;

    .line 445
    .line 446
    iget-object v11, v11, LC0/W0;->a:LI0/m;

    .line 447
    .line 448
    iget-object v13, v11, LI0/m;->d:LI0/i;

    .line 449
    .line 450
    sget-object v15, LI0/p;->d:LI0/s;

    .line 451
    .line 452
    iget-object v13, v13, LI0/i;->q:Lr/G;

    .line 453
    .line 454
    invoke-virtual {v13, v15}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-eqz v13, :cond_12

    .line 459
    .line 460
    invoke-virtual {v2, v12}, Lr/w;->a(I)Z

    .line 461
    .line 462
    .line 463
    move-result v13

    .line 464
    if-eqz v13, :cond_12

    .line 465
    .line 466
    iget-object v13, v11, LI0/m;->d:LI0/i;

    .line 467
    .line 468
    invoke-virtual {v13, v15}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    check-cast v13, Ljava/lang/String;

    .line 473
    .line 474
    const/16 v15, 0x10

    .line 475
    .line 476
    invoke-virtual {v0, v13, v12, v15}, LC0/I;->E(Ljava/lang/String;II)V

    .line 477
    .line 478
    .line 479
    :cond_12
    new-instance v13, LC0/V0;

    .line 480
    .line 481
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 482
    .line 483
    .line 484
    move-result-object v15

    .line 485
    invoke-direct {v13, v11, v15}, LC0/V0;-><init>(LI0/m;Lr/k;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v6, v12, v13}, Lr/v;->h(ILjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    :cond_13
    const/16 v11, 0x8

    .line 492
    .line 493
    shr-long/2addr v8, v11

    .line 494
    add-int/lit8 v10, v10, 0x1

    .line 495
    .line 496
    goto :goto_f

    .line 497
    :cond_14
    const/16 v11, 0x8

    .line 498
    .line 499
    if-ne v14, v11, :cond_16

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_15
    const/16 v11, 0x8

    .line 503
    .line 504
    :goto_10
    if-eq v7, v5, :cond_16

    .line 505
    .line 506
    add-int/lit8 v7, v7, 0x1

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_16
    new-instance v1, LC0/V0;

    .line 510
    .line 511
    iget-object v2, v0, LC0/I;->d:LC0/A;

    .line 512
    .line 513
    invoke-virtual {v2}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v2}, LI0/n;->a()LI0/m;

    .line 518
    .line 519
    .line 520
    move-result-object v2

    .line 521
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-direct {v1, v2, v3}, LC0/V0;-><init>(LI0/m;Lr/k;)V

    .line 526
    .line 527
    .line 528
    iput-object v1, v0, LC0/I;->K:LC0/V0;

    .line 529
    .line 530
    return-void
.end method

.method public final b(Landroid/view/View;)Li1/a;
    .locals 0

    .line 1
    iget-object p1, p0, LC0/I;->m:LC0/E;

    .line 2
    .line 3
    return-object p1
.end method

.method public final j(ILx1/e;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget-object v3, v3, Lx1/e;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 12
    .line 13
    invoke-virtual {v0}, LC0/I;->s()Lr/k;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    invoke-virtual {v5, v1}, Lr/k;->b(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    check-cast v5, LC0/W0;

    .line 22
    .line 23
    if-eqz v5, :cond_1a

    .line 24
    .line 25
    iget-object v5, v5, LC0/W0;->a:LI0/m;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto/16 :goto_11

    .line 30
    .line 31
    :cond_0
    iget-object v6, v5, LI0/m;->d:LI0/i;

    .line 32
    .line 33
    iget-object v7, v6, LI0/i;->q:Lr/G;

    .line 34
    .line 35
    invoke-static {v5}, LC0/I;->t(LI0/m;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    iget-object v9, v0, LC0/I;->G:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v2, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v9

    .line 45
    const/4 v10, -0x1

    .line 46
    if-eqz v9, :cond_1

    .line 47
    .line 48
    iget-object v4, v0, LC0/I;->E:Lr/t;

    .line 49
    .line 50
    invoke-virtual {v4, v1}, Lr/t;->d(I)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eq v1, v10, :cond_1a

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    iget-object v9, v0, LC0/I;->H:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2, v9}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    if-eqz v9, :cond_2

    .line 71
    .line 72
    iget-object v4, v0, LC0/I;->F:Lr/t;

    .line 73
    .line 74
    invoke-virtual {v4, v1}, Lr/t;->d(I)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eq v1, v10, :cond_1a

    .line 79
    .line 80
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    sget-object v1, LI0/h;->a:LI0/s;

    .line 89
    .line 90
    invoke-virtual {v7, v1}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    const/4 v9, 0x0

    .line 95
    if-eqz v1, :cond_17

    .line 96
    .line 97
    if-eqz v4, :cond_17

    .line 98
    .line 99
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"

    .line 100
    .line 101
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_17

    .line 106
    .line 107
    const-string v1, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"

    .line 108
    .line 109
    invoke-virtual {v4, v1, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const-string v7, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"

    .line 114
    .line 115
    invoke-virtual {v4, v7, v10}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-lez v4, :cond_16

    .line 120
    .line 121
    if-ltz v1, :cond_16

    .line 122
    .line 123
    if-eqz v8, :cond_3

    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    goto :goto_0

    .line 130
    :cond_3
    const v7, 0x7fffffff

    .line 131
    .line 132
    .line 133
    :goto_0
    if-lt v1, v7, :cond_4

    .line 134
    .line 135
    goto/16 :goto_f

    .line 136
    .line 137
    :cond_4
    invoke-static {v6}, LC0/W;->h(LI0/i;)LL0/C;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    if-nez v6, :cond_5

    .line 142
    .line 143
    goto/16 :goto_11

    .line 144
    .line 145
    :cond_5
    new-instance v7, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 148
    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    :goto_1
    if-ge v10, v4, :cond_15

    .line 152
    .line 153
    add-int v11, v1, v10

    .line 154
    .line 155
    iget-object v12, v6, LL0/C;->a:LL0/B;

    .line 156
    .line 157
    iget-object v12, v12, LL0/B;->a:LL0/d;

    .line 158
    .line 159
    iget-object v12, v12, LL0/d;->r:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-lt v11, v12, :cond_6

    .line 166
    .line 167
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move/from16 v16, v1

    .line 171
    .line 172
    move/from16 v17, v10

    .line 173
    .line 174
    goto/16 :goto_e

    .line 175
    .line 176
    :cond_6
    iget-object v12, v6, LL0/C;->b:LE/a0;

    .line 177
    .line 178
    iget-object v13, v12, LE/a0;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v13, LL0/l;

    .line 181
    .line 182
    iget-object v13, v13, LL0/l;->b:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v13, LL0/d;

    .line 185
    .line 186
    const/16 v14, 0x29

    .line 187
    .line 188
    const-string v15, "offset("

    .line 189
    .line 190
    if-ltz v11, :cond_7

    .line 191
    .line 192
    iget-object v9, v13, LL0/d;->r:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    if-ge v11, v9, :cond_7

    .line 199
    .line 200
    goto :goto_2

    .line 201
    :cond_7
    const-string v9, ") is out of bounds [0, "

    .line 202
    .line 203
    invoke-static {v15, v9, v11}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    iget-object v13, v13, LL0/d;->r:Ljava/lang/String;

    .line 208
    .line 209
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 210
    .line 211
    .line 212
    move-result v13

    .line 213
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v9

    .line 223
    invoke-static {v9}, LQ0/a;->a(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_2
    iget-object v9, v12, LE/a0;->e:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast v9, Ljava/util/ArrayList;

    .line 229
    .line 230
    invoke-static {v11, v9}, Ly4/b;->o(ILjava/util/List;)I

    .line 231
    .line 232
    .line 233
    move-result v12

    .line 234
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    check-cast v9, LL0/n;

    .line 239
    .line 240
    iget-object v12, v9, LL0/n;->a:LL0/a;

    .line 241
    .line 242
    invoke-virtual {v9, v11}, LL0/n;->a(I)I

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    iget-object v13, v12, LL0/a;->e:Ljava/lang/CharSequence;

    .line 247
    .line 248
    if-ltz v11, :cond_8

    .line 249
    .line 250
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-ge v11, v8, :cond_8

    .line 255
    .line 256
    goto :goto_3

    .line 257
    :cond_8
    const-string v8, ") is out of bounds [0,"

    .line 258
    .line 259
    invoke-static {v15, v8, v11}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    move-result-object v8

    .line 263
    invoke-interface {v13}, Ljava/lang/CharSequence;->length()I

    .line 264
    .line 265
    .line 266
    move-result v13

    .line 267
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    invoke-static {v8}, LQ0/a;->a(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :goto_3
    iget-object v8, v12, LL0/a;->d:LM0/j;

    .line 281
    .line 282
    iget-object v12, v8, LM0/j;->e:Landroid/text/Layout;

    .line 283
    .line 284
    invoke-virtual {v12, v11}, Landroid/text/Layout;->getLineForOffset(I)I

    .line 285
    .line 286
    .line 287
    move-result v13

    .line 288
    invoke-virtual {v8, v13}, LM0/j;->f(I)F

    .line 289
    .line 290
    .line 291
    move-result v14

    .line 292
    invoke-virtual {v8, v13}, LM0/j;->d(I)F

    .line 293
    .line 294
    .line 295
    move-result v15

    .line 296
    invoke-virtual {v12, v13}, Landroid/text/Layout;->getParagraphDirection(I)I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    move/from16 v16, v1

    .line 301
    .line 302
    const/4 v1, 0x1

    .line 303
    if-ne v13, v1, :cond_9

    .line 304
    .line 305
    move v13, v1

    .line 306
    goto :goto_4

    .line 307
    :cond_9
    const/4 v13, 0x0

    .line 308
    :goto_4
    invoke-virtual {v12, v11}, Landroid/text/Layout;->isRtlCharAt(I)Z

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    if-eqz v13, :cond_a

    .line 313
    .line 314
    if-nez v12, :cond_a

    .line 315
    .line 316
    const/4 v1, 0x0

    .line 317
    invoke-virtual {v8, v11, v1}, LM0/j;->g(IZ)F

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    add-int/lit8 v11, v11, 0x1

    .line 322
    .line 323
    const/4 v13, 0x1

    .line 324
    invoke-virtual {v8, v11, v13}, LM0/j;->g(IZ)F

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    goto :goto_6

    .line 329
    :cond_a
    const/4 v1, 0x0

    .line 330
    if-eqz v13, :cond_b

    .line 331
    .line 332
    if-eqz v12, :cond_b

    .line 333
    .line 334
    invoke-virtual {v8, v11, v1}, LM0/j;->h(IZ)F

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    add-int/lit8 v11, v11, 0x1

    .line 339
    .line 340
    const/4 v13, 0x1

    .line 341
    invoke-virtual {v8, v11, v13}, LM0/j;->h(IZ)F

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    :goto_5
    move/from16 v21, v12

    .line 346
    .line 347
    move v12, v8

    .line 348
    move/from16 v8, v21

    .line 349
    .line 350
    goto :goto_6

    .line 351
    :cond_b
    const/4 v13, 0x1

    .line 352
    if-eqz v12, :cond_c

    .line 353
    .line 354
    invoke-virtual {v8, v11, v1}, LM0/j;->g(IZ)F

    .line 355
    .line 356
    .line 357
    move-result v12

    .line 358
    add-int/lit8 v11, v11, 0x1

    .line 359
    .line 360
    invoke-virtual {v8, v11, v13}, LM0/j;->g(IZ)F

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    goto :goto_5

    .line 365
    :cond_c
    invoke-virtual {v8, v11, v1}, LM0/j;->h(IZ)F

    .line 366
    .line 367
    .line 368
    move-result v12

    .line 369
    add-int/lit8 v11, v11, 0x1

    .line 370
    .line 371
    invoke-virtual {v8, v11, v13}, LM0/j;->h(IZ)F

    .line 372
    .line 373
    .line 374
    move-result v8

    .line 375
    :goto_6
    new-instance v1, Landroid/graphics/RectF;

    .line 376
    .line 377
    invoke-direct {v1, v12, v14, v8, v15}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 378
    .line 379
    .line 380
    iget v8, v1, Landroid/graphics/RectF;->left:F

    .line 381
    .line 382
    iget v11, v1, Landroid/graphics/RectF;->top:F

    .line 383
    .line 384
    iget v12, v1, Landroid/graphics/RectF;->right:F

    .line 385
    .line 386
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 387
    .line 388
    iget v9, v9, LL0/n;->f:F

    .line 389
    .line 390
    const/4 v14, 0x0

    .line 391
    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 392
    .line 393
    .line 394
    move-result v14

    .line 395
    int-to-long v14, v14

    .line 396
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    move-wide/from16 v17, v14

    .line 401
    .line 402
    int-to-long v13, v9

    .line 403
    const/16 v9, 0x20

    .line 404
    .line 405
    shl-long v17, v17, v9

    .line 406
    .line 407
    const-wide v19, 0xffffffffL

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    and-long v13, v13, v19

    .line 413
    .line 414
    or-long v13, v17, v13

    .line 415
    .line 416
    new-instance v15, Li0/c;

    .line 417
    .line 418
    move/from16 v18, v9

    .line 419
    .line 420
    move/from16 v17, v10

    .line 421
    .line 422
    shr-long v9, v13, v18

    .line 423
    .line 424
    long-to-int v9, v9

    .line 425
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 426
    .line 427
    .line 428
    move-result v10

    .line 429
    add-float/2addr v10, v8

    .line 430
    and-long v13, v13, v19

    .line 431
    .line 432
    long-to-int v8, v13

    .line 433
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 434
    .line 435
    .line 436
    move-result v13

    .line 437
    add-float/2addr v13, v11

    .line 438
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 439
    .line 440
    .line 441
    move-result v9

    .line 442
    add-float/2addr v9, v12

    .line 443
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 444
    .line 445
    .line 446
    move-result v8

    .line 447
    add-float/2addr v8, v1

    .line 448
    invoke-direct {v15, v10, v13, v9, v8}, Li0/c;-><init>(FFFF)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v5}, LI0/m;->c()LB0/n0;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    const-wide/16 v8, 0x0

    .line 456
    .line 457
    if-eqz v1, :cond_e

    .line 458
    .line 459
    invoke-virtual {v1}, LB0/n0;->B0()Lc0/l;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    iget-boolean v10, v10, Lc0/l;->D:Z

    .line 464
    .line 465
    if-eqz v10, :cond_d

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_d
    const/4 v1, 0x0

    .line 469
    :goto_7
    if-eqz v1, :cond_e

    .line 470
    .line 471
    invoke-virtual {v1, v8, v9}, LB0/n0;->F(J)J

    .line 472
    .line 473
    .line 474
    move-result-wide v8

    .line 475
    :cond_e
    invoke-virtual {v15, v8, v9}, Li0/c;->e(J)Li0/c;

    .line 476
    .line 477
    .line 478
    move-result-object v1

    .line 479
    invoke-virtual {v5}, LI0/m;->e()Li0/c;

    .line 480
    .line 481
    .line 482
    move-result-object v8

    .line 483
    iget v9, v1, Li0/c;->a:F

    .line 484
    .line 485
    iget v10, v8, Li0/c;->c:F

    .line 486
    .line 487
    cmpg-float v9, v9, v10

    .line 488
    .line 489
    if-gez v9, :cond_f

    .line 490
    .line 491
    const/4 v9, 0x1

    .line 492
    goto :goto_8

    .line 493
    :cond_f
    const/4 v9, 0x0

    .line 494
    :goto_8
    iget v10, v8, Li0/c;->a:F

    .line 495
    .line 496
    iget v11, v1, Li0/c;->c:F

    .line 497
    .line 498
    cmpg-float v10, v10, v11

    .line 499
    .line 500
    if-gez v10, :cond_10

    .line 501
    .line 502
    const/4 v10, 0x1

    .line 503
    goto :goto_9

    .line 504
    :cond_10
    const/4 v10, 0x0

    .line 505
    :goto_9
    and-int/2addr v9, v10

    .line 506
    iget v10, v1, Li0/c;->b:F

    .line 507
    .line 508
    iget v11, v8, Li0/c;->d:F

    .line 509
    .line 510
    cmpg-float v10, v10, v11

    .line 511
    .line 512
    if-gez v10, :cond_11

    .line 513
    .line 514
    const/4 v10, 0x1

    .line 515
    goto :goto_a

    .line 516
    :cond_11
    const/4 v10, 0x0

    .line 517
    :goto_a
    and-int/2addr v9, v10

    .line 518
    iget v10, v8, Li0/c;->b:F

    .line 519
    .line 520
    iget v11, v1, Li0/c;->d:F

    .line 521
    .line 522
    cmpg-float v10, v10, v11

    .line 523
    .line 524
    if-gez v10, :cond_12

    .line 525
    .line 526
    const/4 v10, 0x1

    .line 527
    goto :goto_b

    .line 528
    :cond_12
    const/4 v10, 0x0

    .line 529
    :goto_b
    and-int/2addr v9, v10

    .line 530
    if-eqz v9, :cond_13

    .line 531
    .line 532
    invoke-virtual {v1, v8}, Li0/c;->c(Li0/c;)Li0/c;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    goto :goto_c

    .line 537
    :cond_13
    const/4 v1, 0x0

    .line 538
    :goto_c
    if-eqz v1, :cond_14

    .line 539
    .line 540
    iget v8, v1, Li0/c;->a:F

    .line 541
    .line 542
    iget v9, v1, Li0/c;->b:F

    .line 543
    .line 544
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 545
    .line 546
    .line 547
    move-result v8

    .line 548
    int-to-long v10, v8

    .line 549
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    int-to-long v8, v8

    .line 554
    shl-long v10, v10, v18

    .line 555
    .line 556
    and-long v8, v8, v19

    .line 557
    .line 558
    or-long/2addr v8, v10

    .line 559
    iget-object v10, v0, LC0/I;->d:LC0/A;

    .line 560
    .line 561
    invoke-virtual {v10, v8, v9}, LC0/A;->y(J)J

    .line 562
    .line 563
    .line 564
    move-result-wide v8

    .line 565
    iget v11, v1, Li0/c;->c:F

    .line 566
    .line 567
    iget v1, v1, Li0/c;->d:F

    .line 568
    .line 569
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 570
    .line 571
    .line 572
    move-result v11

    .line 573
    int-to-long v11, v11

    .line 574
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 575
    .line 576
    .line 577
    move-result v1

    .line 578
    int-to-long v13, v1

    .line 579
    shl-long v11, v11, v18

    .line 580
    .line 581
    and-long v13, v13, v19

    .line 582
    .line 583
    or-long/2addr v11, v13

    .line 584
    invoke-virtual {v10, v11, v12}, LC0/A;->y(J)J

    .line 585
    .line 586
    .line 587
    move-result-wide v10

    .line 588
    new-instance v1, Landroid/graphics/RectF;

    .line 589
    .line 590
    shr-long v12, v8, v18

    .line 591
    .line 592
    long-to-int v12, v12

    .line 593
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 594
    .line 595
    .line 596
    move-result v12

    .line 597
    and-long v8, v8, v19

    .line 598
    .line 599
    long-to-int v8, v8

    .line 600
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 601
    .line 602
    .line 603
    move-result v8

    .line 604
    shr-long v13, v10, v18

    .line 605
    .line 606
    long-to-int v9, v13

    .line 607
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 608
    .line 609
    .line 610
    move-result v9

    .line 611
    and-long v10, v10, v19

    .line 612
    .line 613
    long-to-int v10, v10

    .line 614
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 615
    .line 616
    .line 617
    move-result v10

    .line 618
    invoke-direct {v1, v12, v8, v9, v10}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 619
    .line 620
    .line 621
    goto :goto_d

    .line 622
    :cond_14
    const/4 v1, 0x0

    .line 623
    :goto_d
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    :goto_e
    add-int/lit8 v10, v17, 0x1

    .line 627
    .line 628
    move/from16 v1, v16

    .line 629
    .line 630
    const/4 v9, 0x0

    .line 631
    goto/16 :goto_1

    .line 632
    .line 633
    :cond_15
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 634
    .line 635
    .line 636
    move-result-object v1

    .line 637
    const/4 v3, 0x0

    .line 638
    new-array v3, v3, [Landroid/graphics/RectF;

    .line 639
    .line 640
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    check-cast v3, [Landroid/os/Parcelable;

    .line 645
    .line 646
    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :cond_16
    :goto_f
    const-string v1, "AccessibilityDelegate"

    .line 651
    .line 652
    const-string v2, "Invalid arguments for accessibility character locations"

    .line 653
    .line 654
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 655
    .line 656
    .line 657
    return-void

    .line 658
    :cond_17
    sget-object v1, LI0/p;->w:LI0/s;

    .line 659
    .line 660
    invoke-virtual {v7, v1}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v6

    .line 664
    if-eqz v6, :cond_19

    .line 665
    .line 666
    if-eqz v4, :cond_19

    .line 667
    .line 668
    const-string v4, "androidx.compose.ui.semantics.testTag"

    .line 669
    .line 670
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v4

    .line 674
    if-eqz v4, :cond_19

    .line 675
    .line 676
    invoke-virtual {v7, v1}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    if-nez v1, :cond_18

    .line 681
    .line 682
    const/4 v9, 0x0

    .line 683
    goto :goto_10

    .line 684
    :cond_18
    move-object v9, v1

    .line 685
    :goto_10
    check-cast v9, Ljava/lang/String;

    .line 686
    .line 687
    if-eqz v9, :cond_1a

    .line 688
    .line 689
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    invoke-virtual {v1, v2, v9}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 694
    .line 695
    .line 696
    return-void

    .line 697
    :cond_19
    const-string v1, "androidx.compose.ui.semantics.id"

    .line 698
    .line 699
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    move-result v1

    .line 703
    if-eqz v1, :cond_1a

    .line 704
    .line 705
    invoke-virtual {v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    iget v3, v5, LI0/m;->g:I

    .line 710
    .line 711
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 712
    .line 713
    .line 714
    :cond_1a
    :goto_11
    return-void
.end method

.method public final k(LC0/W0;)Landroid/graphics/Rect;
    .locals 11

    .line 1
    iget-object p1, p1, LC0/W0;->b:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 4
    .line 5
    int-to-float v0, v0

    .line 6
    iget v1, p1, Landroid/graphics/Rect;->top:I

    .line 7
    .line 8
    int-to-float v1, v1

    .line 9
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-long v2, v0

    .line 14
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-long v0, v0

    .line 19
    const/16 v4, 0x20

    .line 20
    .line 21
    shl-long/2addr v2, v4

    .line 22
    const-wide v5, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr v0, v5

    .line 28
    or-long/2addr v0, v2

    .line 29
    iget-object v2, p0, LC0/I;->d:LC0/A;

    .line 30
    .line 31
    invoke-virtual {v2, v0, v1}, LC0/A;->y(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    iget v3, p1, Landroid/graphics/Rect;->right:I

    .line 36
    .line 37
    int-to-float v3, v3

    .line 38
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 39
    .line 40
    int-to-float p1, p1

    .line 41
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    int-to-long v7, v3

    .line 46
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    int-to-long v9, p1

    .line 51
    shl-long/2addr v7, v4

    .line 52
    and-long/2addr v9, v5

    .line 53
    or-long/2addr v7, v9

    .line 54
    invoke-virtual {v2, v7, v8}, LC0/A;->y(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    new-instance p1, Landroid/graphics/Rect;

    .line 59
    .line 60
    shr-long v7, v0, v4

    .line 61
    .line 62
    long-to-int v7, v7

    .line 63
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    float-to-double v7, v7

    .line 68
    invoke-static {v7, v8}, Ljava/lang/Math;->floor(D)D

    .line 69
    .line 70
    .line 71
    move-result-wide v7

    .line 72
    double-to-float v7, v7

    .line 73
    float-to-int v7, v7

    .line 74
    and-long/2addr v0, v5

    .line 75
    long-to-int v0, v0

    .line 76
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    float-to-double v0, v0

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    double-to-float v0, v0

    .line 86
    float-to-int v0, v0

    .line 87
    shr-long v8, v2, v4

    .line 88
    .line 89
    long-to-int v1, v8

    .line 90
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    float-to-double v8, v1

    .line 95
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 96
    .line 97
    .line 98
    move-result-wide v8

    .line 99
    double-to-float v1, v8

    .line 100
    float-to-int v1, v1

    .line 101
    and-long/2addr v2, v5

    .line 102
    long-to-int v2, v2

    .line 103
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    float-to-double v2, v2

    .line 108
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 109
    .line 110
    .line 111
    move-result-wide v2

    .line 112
    double-to-float v2, v2

    .line 113
    float-to-int v2, v2

    .line 114
    invoke-direct {p1, v7, v0, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 115
    .line 116
    .line 117
    return-object p1
.end method

.method public final l(Ls5/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, LC0/G;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, LC0/G;

    .line 11
    .line 12
    iget v3, v2, LC0/G;->v:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, LC0/G;->v:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, LC0/G;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, LC0/G;-><init>(LC0/I;Ls5/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, LC0/G;->t:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, LC0/G;->v:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    sget-object v6, Lr5/a;->q:Lr5/a;

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    if-eq v3, v5, :cond_2

    .line 40
    .line 41
    if-ne v3, v4, :cond_1

    .line 42
    .line 43
    iget-object v3, v2, LC0/G;->s:LO5/b;

    .line 44
    .line 45
    iget-object v7, v2, LC0/G;->r:Lr/w;

    .line 46
    .line 47
    iget-object v8, v2, LC0/G;->q:LC0/I;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    move v0, v4

    .line 53
    move v10, v5

    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto/16 :goto_8

    .line 58
    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    iget-object v3, v2, LC0/G;->s:LO5/b;

    .line 68
    .line 69
    iget-object v7, v2, LC0/G;->r:Lr/w;

    .line 70
    .line 71
    iget-object v8, v2, LC0/G;->q:LC0/I;

    .line 72
    .line 73
    :try_start_1
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_3
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :try_start_2
    new-instance v0, Lr/w;

    .line 81
    .line 82
    invoke-direct {v0}, Lr/w;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v3, v1, LC0/I;->z:LO5/e;

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v7, LO5/b;

    .line 91
    .line 92
    invoke-direct {v7, v3}, LO5/b;-><init>(LO5/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 93
    .line 94
    .line 95
    move-object v8, v1

    .line 96
    :goto_1
    :try_start_3
    iput-object v8, v2, LC0/G;->q:LC0/I;

    .line 97
    .line 98
    iput-object v0, v2, LC0/G;->r:Lr/w;

    .line 99
    .line 100
    iput-object v7, v2, LC0/G;->s:LO5/b;

    .line 101
    .line 102
    iput v5, v2, LC0/G;->v:I

    .line 103
    .line 104
    invoke-virtual {v7, v2}, LO5/b;->b(Ls5/c;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    if-ne v3, v6, :cond_4

    .line 109
    .line 110
    goto/16 :goto_5

    .line 111
    .line 112
    :cond_4
    move-object/from16 v16, v7

    .line 113
    .line 114
    move-object v7, v0

    .line 115
    move-object v0, v3

    .line 116
    move-object/from16 v3, v16

    .line 117
    .line 118
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_a

    .line 125
    .line 126
    invoke-virtual {v3}, LO5/b;->c()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8}, LC0/I;->u()Z

    .line 130
    .line 131
    .line 132
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 133
    iget-object v9, v8, LC0/I;->y:Lr/f;

    .line 134
    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    :try_start_4
    iget v0, v9, Lr/f;->s:I

    .line 138
    .line 139
    const/4 v10, 0x0

    .line 140
    move v11, v10

    .line 141
    :goto_3
    if-ge v11, v0, :cond_5

    .line 142
    .line 143
    iget-object v12, v9, Lr/f;->r:[Ljava/lang/Object;

    .line 144
    .line 145
    aget-object v12, v12, v11

    .line 146
    .line 147
    check-cast v12, LB0/L;

    .line 148
    .line 149
    invoke-virtual {v8, v12, v7}, LC0/I;->H(LB0/L;Lr/w;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v8, v12}, LC0/I;->I(LB0/L;)V

    .line 153
    .line 154
    .line 155
    add-int/lit8 v11, v11, 0x1

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    iput v10, v7, Lr/w;->d:I

    .line 159
    .line 160
    iget-object v0, v7, Lr/w;->a:[J

    .line 161
    .line 162
    sget-object v10, Lr/O;->a:[J

    .line 163
    .line 164
    if-eq v0, v10, :cond_6

    .line 165
    .line 166
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-static {v0, v10, v11}, Ln5/k;->K0([JJ)V

    .line 172
    .line 173
    .line 174
    iget-object v0, v7, Lr/w;->a:[J

    .line 175
    .line 176
    iget v10, v7, Lr/w;->c:I

    .line 177
    .line 178
    shr-int/lit8 v11, v10, 0x3

    .line 179
    .line 180
    and-int/lit8 v10, v10, 0x7

    .line 181
    .line 182
    shl-int/lit8 v10, v10, 0x3

    .line 183
    .line 184
    aget-wide v12, v0, v11

    .line 185
    .line 186
    const-wide/16 v14, 0xff

    .line 187
    .line 188
    shl-long/2addr v14, v10

    .line 189
    not-long v4, v14

    .line 190
    and-long/2addr v4, v12

    .line 191
    or-long/2addr v4, v14

    .line 192
    aput-wide v4, v0, v11

    .line 193
    .line 194
    :cond_6
    iget v0, v7, Lr/w;->c:I

    .line 195
    .line 196
    invoke-static {v0}, Lr/O;->a(I)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    iget v4, v7, Lr/w;->d:I

    .line 201
    .line 202
    sub-int/2addr v0, v4

    .line 203
    iput v0, v7, Lr/w;->e:I

    .line 204
    .line 205
    iget-boolean v0, v8, LC0/I;->L:Z

    .line 206
    .line 207
    if-nez v0, :cond_7

    .line 208
    .line 209
    const/4 v10, 0x1

    .line 210
    iput-boolean v10, v8, LC0/I;->L:Z

    .line 211
    .line 212
    iget-object v0, v8, LC0/I;->l:Landroid/os/Handler;

    .line 213
    .line 214
    iget-object v4, v8, LC0/I;->M:LC0/m;

    .line 215
    .line 216
    invoke-virtual {v0, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 217
    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_7
    const/4 v10, 0x1

    .line 221
    goto :goto_4

    .line 222
    :cond_8
    move v10, v5

    .line 223
    :goto_4
    invoke-virtual {v9}, Lr/f;->clear()V

    .line 224
    .line 225
    .line 226
    iget-object v0, v8, LC0/I;->s:Lr/v;

    .line 227
    .line 228
    invoke-virtual {v0}, Lr/v;->c()V

    .line 229
    .line 230
    .line 231
    iget-object v0, v8, LC0/I;->t:Lr/v;

    .line 232
    .line 233
    invoke-virtual {v0}, Lr/v;->c()V

    .line 234
    .line 235
    .line 236
    iget-wide v4, v8, LC0/I;->h:J

    .line 237
    .line 238
    iput-object v8, v2, LC0/G;->q:LC0/I;

    .line 239
    .line 240
    iput-object v7, v2, LC0/G;->r:Lr/w;

    .line 241
    .line 242
    iput-object v3, v2, LC0/G;->s:LO5/b;

    .line 243
    .line 244
    const/4 v0, 0x2

    .line 245
    iput v0, v2, LC0/G;->v:I

    .line 246
    .line 247
    invoke-static {v4, v5, v2}, LM5/y;->h(JLs5/c;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 251
    if-ne v4, v6, :cond_9

    .line 252
    .line 253
    :goto_5
    return-object v6

    .line 254
    :cond_9
    :goto_6
    move v4, v0

    .line 255
    move-object v0, v7

    .line 256
    move v5, v10

    .line 257
    move-object v7, v3

    .line 258
    goto/16 :goto_1

    .line 259
    .line 260
    :cond_a
    iget-object v0, v8, LC0/I;->y:Lr/f;

    .line 261
    .line 262
    invoke-virtual {v0}, Lr/f;->clear()V

    .line 263
    .line 264
    .line 265
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 266
    .line 267
    return-object v0

    .line 268
    :goto_7
    move-object v8, v1

    .line 269
    goto :goto_8

    .line 270
    :catchall_1
    move-exception v0

    .line 271
    goto :goto_7

    .line 272
    :goto_8
    iget-object v2, v8, LC0/I;->y:Lr/f;

    .line 273
    .line 274
    invoke-virtual {v2}, Lr/f;->clear()V

    .line 275
    .line 276
    .line 277
    throw v0
.end method

.method public final m(ZIJ)Z
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    :cond_0
    const/16 v16, 0x0

    .line 24
    .line 25
    goto/16 :goto_a

    .line 26
    .line 27
    :cond_1
    invoke-virtual/range {p0 .. p0}, LC0/I;->s()Lr/k;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-wide v5, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2, v5, v6}, Li0/b;->b(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_0

    .line 41
    .line 42
    const-wide v5, 0x7fffffff7fffffffL

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    and-long/2addr v5, v1

    .line 48
    const-wide v7, 0x7fffff007fffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    add-long/2addr v5, v7

    .line 54
    const-wide v7, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v5, v7

    .line 60
    const-wide/16 v7, 0x0

    .line 61
    .line 62
    cmp-long v5, v5, v7

    .line 63
    .line 64
    if-nez v5, :cond_0

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    if-ne v0, v5, :cond_2

    .line 68
    .line 69
    sget-object v0, LI0/p;->t:LI0/s;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    if-nez v0, :cond_11

    .line 73
    .line 74
    sget-object v0, LI0/p;->s:LI0/s;

    .line 75
    .line 76
    :goto_0
    iget-object v6, v3, Lr/k;->c:[Ljava/lang/Object;

    .line 77
    .line 78
    iget-object v3, v3, Lr/k;->a:[J

    .line 79
    .line 80
    array-length v7, v3

    .line 81
    add-int/lit8 v7, v7, -0x2

    .line 82
    .line 83
    if-ltz v7, :cond_0

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    :goto_1
    aget-wide v10, v3, v8

    .line 88
    .line 89
    not-long v12, v10

    .line 90
    const/4 v14, 0x7

    .line 91
    shl-long/2addr v12, v14

    .line 92
    and-long/2addr v12, v10

    .line 93
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    and-long/2addr v12, v14

    .line 99
    cmp-long v12, v12, v14

    .line 100
    .line 101
    if-eqz v12, :cond_f

    .line 102
    .line 103
    sub-int v12, v8, v7

    .line 104
    .line 105
    not-int v12, v12

    .line 106
    ushr-int/lit8 v12, v12, 0x1f

    .line 107
    .line 108
    const/16 v13, 0x8

    .line 109
    .line 110
    rsub-int/lit8 v12, v12, 0x8

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    :goto_2
    if-ge v14, v12, :cond_d

    .line 114
    .line 115
    const-wide/16 v15, 0xff

    .line 116
    .line 117
    and-long/2addr v15, v10

    .line 118
    const-wide/16 v17, 0x80

    .line 119
    .line 120
    cmp-long v15, v15, v17

    .line 121
    .line 122
    if-gez v15, :cond_b

    .line 123
    .line 124
    shl-int/lit8 v15, v8, 0x3

    .line 125
    .line 126
    add-int/2addr v15, v14

    .line 127
    aget-object v15, v6, v15

    .line 128
    .line 129
    check-cast v15, LC0/W0;

    .line 130
    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    iget-object v4, v15, LC0/W0;->b:Landroid/graphics/Rect;

    .line 134
    .line 135
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    int-to-float v5, v5

    .line 138
    move/from16 p1, v13

    .line 139
    .line 140
    iget v13, v4, Landroid/graphics/Rect;->top:I

    .line 141
    .line 142
    int-to-float v13, v13

    .line 143
    iget v1, v4, Landroid/graphics/Rect;->right:I

    .line 144
    .line 145
    int-to-float v1, v1

    .line 146
    iget v2, v4, Landroid/graphics/Rect;->bottom:I

    .line 147
    .line 148
    int-to-float v2, v2

    .line 149
    const/16 v4, 0x20

    .line 150
    .line 151
    move/from16 v18, v1

    .line 152
    .line 153
    move/from16 v19, v2

    .line 154
    .line 155
    shr-long v1, p3, v4

    .line 156
    .line 157
    long-to-int v1, v1

    .line 158
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    const-wide v20, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    move v4, v1

    .line 168
    and-long v1, p3, v20

    .line 169
    .line 170
    long-to-int v1, v1

    .line 171
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    cmpl-float v2, v4, v5

    .line 176
    .line 177
    if-ltz v2, :cond_3

    .line 178
    .line 179
    const/4 v2, 0x1

    .line 180
    goto :goto_3

    .line 181
    :cond_3
    move/from16 v2, v16

    .line 182
    .line 183
    :goto_3
    cmpg-float v4, v4, v18

    .line 184
    .line 185
    if-gez v4, :cond_4

    .line 186
    .line 187
    const/4 v4, 0x1

    .line 188
    goto :goto_4

    .line 189
    :cond_4
    move/from16 v4, v16

    .line 190
    .line 191
    :goto_4
    and-int/2addr v2, v4

    .line 192
    cmpl-float v4, v1, v13

    .line 193
    .line 194
    if-ltz v4, :cond_5

    .line 195
    .line 196
    const/4 v4, 0x1

    .line 197
    goto :goto_5

    .line 198
    :cond_5
    move/from16 v4, v16

    .line 199
    .line 200
    :goto_5
    and-int/2addr v2, v4

    .line 201
    cmpg-float v1, v1, v19

    .line 202
    .line 203
    if-gez v1, :cond_6

    .line 204
    .line 205
    const/4 v1, 0x1

    .line 206
    goto :goto_6

    .line 207
    :cond_6
    move/from16 v1, v16

    .line 208
    .line 209
    :goto_6
    and-int/2addr v1, v2

    .line 210
    if-nez v1, :cond_7

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_7
    iget-object v1, v15, LC0/W0;->a:LI0/m;

    .line 214
    .line 215
    iget-object v1, v1, LI0/m;->d:LI0/i;

    .line 216
    .line 217
    iget-object v1, v1, LI0/i;->q:Lr/G;

    .line 218
    .line 219
    invoke-virtual {v1, v0}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    if-nez v1, :cond_8

    .line 224
    .line 225
    const/4 v1, 0x0

    .line 226
    :cond_8
    check-cast v1, LI0/g;

    .line 227
    .line 228
    if-nez v1, :cond_9

    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_9
    iget-object v2, v1, LI0/g;->a:LE/Q;

    .line 232
    .line 233
    if-gez p2, :cond_a

    .line 234
    .line 235
    invoke-virtual {v2}, LE/Q;->invoke()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/lang/Number;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    const/4 v2, 0x0

    .line 246
    cmpl-float v1, v1, v2

    .line 247
    .line 248
    if-lez v1, :cond_c

    .line 249
    .line 250
    :goto_7
    const/4 v9, 0x1

    .line 251
    goto :goto_8

    .line 252
    :cond_a
    invoke-virtual {v2}, LE/Q;->invoke()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    check-cast v2, Ljava/lang/Number;

    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    iget-object v1, v1, LI0/g;->b:LE/Q;

    .line 263
    .line 264
    invoke-virtual {v1}, LE/Q;->invoke()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Ljava/lang/Number;

    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    cmpg-float v1, v2, v1

    .line 275
    .line 276
    if-gez v1, :cond_c

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_b
    move/from16 p1, v13

    .line 280
    .line 281
    const/16 v16, 0x0

    .line 282
    .line 283
    :cond_c
    :goto_8
    shr-long v10, v10, p1

    .line 284
    .line 285
    add-int/lit8 v14, v14, 0x1

    .line 286
    .line 287
    move/from16 v13, p1

    .line 288
    .line 289
    move-wide/from16 v1, p3

    .line 290
    .line 291
    const/4 v5, 0x1

    .line 292
    goto/16 :goto_2

    .line 293
    .line 294
    :cond_d
    move v1, v13

    .line 295
    const/16 v16, 0x0

    .line 296
    .line 297
    if-ne v12, v1, :cond_e

    .line 298
    .line 299
    goto :goto_9

    .line 300
    :cond_e
    return v9

    .line 301
    :cond_f
    const/16 v16, 0x0

    .line 302
    .line 303
    :goto_9
    if-eq v8, v7, :cond_10

    .line 304
    .line 305
    add-int/lit8 v8, v8, 0x1

    .line 306
    .line 307
    move-wide/from16 v1, p3

    .line 308
    .line 309
    const/4 v5, 0x1

    .line 310
    goto/16 :goto_1

    .line 311
    .line 312
    :cond_10
    return v9

    .line 313
    :cond_11
    new-instance v0, LC2/e;

    .line 314
    .line 315
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 316
    .line 317
    .line 318
    throw v0

    .line 319
    :goto_a
    return v16
.end method

.method public final n()V
    .locals 2

    .line 1
    const-string v0, "sendAccessibilitySemanticsStructureChangeEvents"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p0}, LC0/I;->u()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LC0/I;->d:LC0/A;

    .line 13
    .line 14
    invoke-virtual {v0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LI0/n;->a()LI0/m;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, LC0/I;->K:LC0/V0;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, LC0/I;->A(LI0/m;LC0/V0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 31
    .line 32
    .line 33
    const-string v0, "sendSemanticsPropertyChangeEvents"

    .line 34
    .line 35
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-virtual {p0}, LC0/I;->s()Lr/k;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p0, v0}, LC0/I;->G(Lr/k;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 43
    .line 44
    .line 45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 46
    .line 47
    .line 48
    const-string v0, "updateSemanticsNodesCopyAndPanes"

    .line 49
    .line 50
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :try_start_2
    invoke-virtual {p0}, LC0/I;->L()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :catchall_2
    move-exception v0

    .line 66
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 67
    .line 68
    .line 69
    throw v0

    .line 70
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 71
    .line 72
    .line 73
    throw v0
.end method

.method public final o(II)Landroid/view/accessibility/AccessibilityEvent;
    .locals 2

    .line 1
    invoke-static {p2}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    const-string v0, "android.view.View"

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LC0/I;->d:LC0/A;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityEvent;->setPackageName(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, v0, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LC0/I;->u()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p0}, LC0/I;->s()Lr/k;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0, p1}, Lr/k;->b(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, LC0/W0;

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p1, LC0/W0;->a:LI0/m;

    .line 49
    .line 50
    iget-object p1, p1, LI0/m;->d:LI0/i;

    .line 51
    .line 52
    sget-object v0, LI0/p;->G:LI0/s;

    .line 53
    .line 54
    iget-object p1, p1, LI0/i;->q:Lr/G;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setPassword(Z)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-object p2
.end method

.method public final p(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;
    .locals 1

    .line 1
    const/16 v0, 0x2000

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, LC0/I;->o(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    if-eqz p3, :cond_1

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 23
    .line 24
    .line 25
    :cond_1
    if-eqz p4, :cond_2

    .line 26
    .line 27
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-virtual {p1, p2}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 32
    .line 33
    .line 34
    :cond_2
    if-eqz p5, :cond_3

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p2, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_3
    return-object p1
.end method

.method public final q(LI0/m;)I
    .locals 4

    .line 1
    iget-object v0, p1, LI0/m;->d:LI0/i;

    .line 2
    .line 3
    iget-object p1, p1, LI0/m;->d:LI0/i;

    .line 4
    .line 5
    sget-object v1, LI0/p;->a:LI0/s;

    .line 6
    .line 7
    sget-object v1, LI0/p;->a:LI0/s;

    .line 8
    .line 9
    iget-object v0, v0, LI0/i;->q:Lr/G;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, LI0/p;->D:LI0/s;

    .line 18
    .line 19
    iget-object v1, p1, LI0/i;->q:Lr/G;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v0}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, LL0/E;

    .line 32
    .line 33
    iget-wide v0, p1, LL0/E;->a:J

    .line 34
    .line 35
    const-wide v2, 0xffffffffL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v0, v2

    .line 41
    long-to-int p1, v0

    .line 42
    return p1

    .line 43
    :cond_0
    iget p1, p0, LC0/I;->w:I

    .line 44
    .line 45
    return p1
.end method

.method public final r(LI0/m;)I
    .locals 2

    .line 1
    iget-object v0, p1, LI0/m;->d:LI0/i;

    .line 2
    .line 3
    iget-object p1, p1, LI0/m;->d:LI0/i;

    .line 4
    .line 5
    sget-object v1, LI0/p;->a:LI0/s;

    .line 6
    .line 7
    sget-object v1, LI0/p;->a:LI0/s;

    .line 8
    .line 9
    iget-object v0, v0, LI0/i;->q:Lr/G;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    sget-object v0, LI0/p;->D:LI0/s;

    .line 18
    .line 19
    iget-object v1, p1, LI0/i;->q:Lr/G;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lr/G;->c(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1, v0}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, LL0/E;

    .line 32
    .line 33
    iget-wide v0, p1, LL0/E;->a:J

    .line 34
    .line 35
    const/16 p1, 0x20

    .line 36
    .line 37
    shr-long/2addr v0, p1

    .line 38
    long-to-int p1, v0

    .line 39
    return p1

    .line 40
    :cond_0
    iget p1, p0, LC0/I;->w:I

    .line 41
    .line 42
    return p1
.end method

.method public final s()Lr/k;
    .locals 7

    .line 1
    iget-boolean v0, p0, LC0/I;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LC0/I;->A:Z

    .line 7
    .line 8
    iget-object v0, p0, LC0/I;->d:LC0/A;

    .line 9
    .line 10
    invoke-virtual {v0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1}, LC0/W;->f(LI0/n;)Lr/v;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, LC0/I;->C:Lr/v;

    .line 19
    .line 20
    invoke-virtual {p0}, LC0/I;->u()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, p0, LC0/I;->C:Lr/v;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v2, LC0/M;->a:[Ljava/util/Comparator;

    .line 37
    .line 38
    iget-object v2, p0, LC0/I;->E:Lr/t;

    .line 39
    .line 40
    invoke-virtual {v2}, Lr/t;->a()V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, LC0/I;->F:Lr/t;

    .line 44
    .line 45
    invoke-virtual {v3}, Lr/t;->a()V

    .line 46
    .line 47
    .line 48
    const/4 v4, -0x1

    .line 49
    invoke-virtual {v1, v4}, Lr/k;->b(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, LC0/W0;

    .line 54
    .line 55
    if-eqz v4, :cond_0

    .line 56
    .line 57
    iget-object v4, v4, LC0/W0;->a:LI0/m;

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v4, 0x0

    .line 61
    :goto_0
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, LC0/M;->f(LI0/m;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-static {v4}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-static {v5, v4, v1, v0}, LC0/M;->h(ZLjava/util/List;Lr/k;Landroid/content/res/Resources;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v4, 0x1

    .line 81
    if-gt v4, v1, :cond_1

    .line 82
    .line 83
    :goto_1
    add-int/lit8 v5, v4, -0x1

    .line 84
    .line 85
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    check-cast v5, LI0/m;

    .line 90
    .line 91
    iget v5, v5, LI0/m;->g:I

    .line 92
    .line 93
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, LI0/m;

    .line 98
    .line 99
    iget v6, v6, LI0/m;->g:I

    .line 100
    .line 101
    invoke-virtual {v2, v5, v6}, Lr/t;->f(II)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3, v6, v5}, Lr/t;->f(II)V

    .line 105
    .line 106
    .line 107
    if-eq v4, v1, :cond_1

    .line 108
    .line 109
    add-int/lit8 v4, v4, 0x1

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_1
    iget-object v0, p0, LC0/I;->C:Lr/v;

    .line 113
    .line 114
    return-object v0
.end method

.method public final u()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC0/I;->g:Landroid/view/accessibility/AccessibilityManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LC0/I;->k:Ljava/util/List;

    .line 10
    .line 11
    check-cast v0, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final v(LB0/L;)V
    .locals 1

    .line 1
    iget-object v0, p0, LC0/I;->y:Lr/f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/f;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, LC0/I;->z:LO5/e;

    .line 10
    .line 11
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-interface {p1, v0}, LO5/w;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final z(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LC0/I;->d:LC0/A;

    .line 2
    .line 3
    invoke-virtual {v0}, LC0/A;->getSemanticsOwner()LI0/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LI0/n;->a()LI0/m;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v0, v0, LI0/m;->g:I

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    :cond_0
    return p1
.end method
