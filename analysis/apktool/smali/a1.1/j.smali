.class public final La1/j;
.super Lb/m;
.source "SourceFile"


# instance fields
.field public t:LB5/a;

.field public u:La1/i;

.field public final v:Landroid/view/View;

.field public final w:La1/h;


# direct methods
.method public constructor <init>(LB5/a;La1/i;Landroid/view/View;LW0/l;LW0/c;Ljava/util/UUID;)V
    .locals 4

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v2, p2, La1/i;->e:Z

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const v2, 0x7f12012f

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const v2, 0x7f120133

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {p0, v0, v1}, Lb/m;-><init>(Landroid/content/Context;I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La1/j;->t:LB5/a;

    .line 26
    .line 27
    iput-object p2, p0, La1/j;->u:La1/i;

    .line 28
    .line 29
    iput-object p3, p0, La1/j;->v:Landroid/view/View;

    .line 30
    .line 31
    const/16 p1, 0x8

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    if-eqz p2, :cond_3

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-virtual {p2, v0}, Landroid/view/Window;->requestFeature(I)Z

    .line 42
    .line 43
    .line 44
    const v0, 0x106000d

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, La1/j;->u:La1/i;

    .line 51
    .line 52
    iget-boolean v0, v0, La1/i;->e:Z

    .line 53
    .line 54
    invoke-static {p2, v0}, Ln5/A;->A(Landroid/view/Window;Z)V

    .line 55
    .line 56
    .line 57
    const/16 v0, 0x11

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Landroid/view/Window;->setGravity(I)V

    .line 60
    .line 61
    .line 62
    new-instance v0, La1/h;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {v0, v2, p2}, La1/h;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    .line 69
    .line 70
    .line 71
    new-instance v2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v3, "Dialog:"

    .line 74
    .line 75
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p6

    .line 85
    const v2, 0x7f090087

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p5, p1}, LW0/c;->u(F)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    .line 99
    .line 100
    .line 101
    new-instance p1, LC0/c1;

    .line 102
    .line 103
    const/4 p5, 0x2

    .line 104
    invoke-direct {p1, p5}, LC0/c1;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, La1/j;->w:La1/h;

    .line 111
    .line 112
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    instance-of p2, p1, Landroid/view/ViewGroup;

    .line 117
    .line 118
    if-eqz p2, :cond_1

    .line 119
    .line 120
    check-cast p1, Landroid/view/ViewGroup;

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_1
    const/4 p1, 0x0

    .line 124
    :goto_1
    if-eqz p1, :cond_2

    .line 125
    .line 126
    invoke-static {p1}, La1/j;->e(Landroid/view/ViewGroup;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    invoke-virtual {p0, v0}, Lb/m;->setContentView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    invoke-static {p3}, Landroidx/lifecycle/X;->d(Landroid/view/View;)Landroidx/lifecycle/x;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {v0, p1}, Landroidx/lifecycle/X;->h(Landroid/view/View;Landroidx/lifecycle/x;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p3}, Landroidx/lifecycle/X;->e(Landroid/view/View;)Landroidx/lifecycle/l0;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-static {v0, p1}, Landroidx/lifecycle/X;->i(Landroid/view/View;Landroidx/lifecycle/l0;)V

    .line 144
    .line 145
    .line 146
    invoke-static {p3}, Lcom/google/android/gms/internal/measurement/n2;->p(Landroid/view/View;)Lg2/e;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/measurement/n2;->M(Landroid/view/View;Lg2/e;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, La1/j;->t:LB5/a;

    .line 154
    .line 155
    iget-object p2, p0, La1/j;->u:La1/i;

    .line 156
    .line 157
    invoke-virtual {p0, p1, p2, p4}, La1/j;->f(LB5/a;La1/i;LW0/l;)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lb/m;->s:Lb/A;

    .line 161
    .line 162
    new-instance p2, La1/a;

    .line 163
    .line 164
    const/4 p3, 0x1

    .line 165
    invoke-direct {p2, p0, p3}, La1/a;-><init>(La1/j;I)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1, p0, p2}, Lcom/google/android/gms/internal/measurement/P1;->c(Lb/A;Lb/m;LB5/c;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 173
    .line 174
    const-string p2, "Dialog has no window"

    .line 175
    .line 176
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1
.end method

.method public static final e(Landroid/view/ViewGroup;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 3
    .line 4
    .line 5
    instance-of v1, p0, La1/h;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :goto_0
    if-ge v0, v1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-static {v2}, La1/j;->e(Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(LB5/a;La1/i;LW0/l;)V
    .locals 6

    .line 1
    iput-object p1, p0, La1/j;->t:LB5/a;

    .line 2
    .line 3
    iput-object p2, p0, La1/j;->u:La1/i;

    .line 4
    .line 5
    iget-object p1, p2, La1/i;->c:La1/k;

    .line 6
    .line 7
    sget v0, La1/e;->a:I

    .line 8
    .line 9
    iget-object v0, p0, La1/j;->v:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    instance-of v1, v0, Landroid/view/WindowManager$LayoutParams;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    const/4 v1, 0x1

    .line 28
    const/16 v2, 0x2000

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 34
    .line 35
    and-int/2addr v0, v2

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    move v0, v1

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v0, v3

    .line 41
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_4

    .line 46
    .line 47
    if-eq p1, v1, :cond_3

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    if-ne p1, v0, :cond_2

    .line 51
    .line 52
    move v0, v3

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    new-instance p1, LC2/e;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_3
    move v0, v1

    .line 61
    :cond_4
    :goto_2
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    move v0, v2

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    const/16 v0, -0x2001

    .line 73
    .line 74
    :goto_3
    invoke-virtual {p1, v0, v2}, Landroid/view/Window;->setFlags(II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_7

    .line 82
    .line 83
    if-ne p1, v1, :cond_6

    .line 84
    .line 85
    move p1, v1

    .line 86
    goto :goto_4

    .line 87
    :cond_6
    new-instance p1, LC2/e;

    .line 88
    .line 89
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 90
    .line 91
    .line 92
    throw p1

    .line 93
    :cond_7
    move p1, v3

    .line 94
    :goto_4
    iget-object p3, p0, La1/j;->w:La1/h;

    .line 95
    .line 96
    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 97
    .line 98
    .line 99
    iget-boolean p1, p2, La1/i;->e:Z

    .line 100
    .line 101
    iget-boolean v0, p2, La1/i;->d:Z

    .line 102
    .line 103
    iget-object v2, p3, La1/h;->y:Landroid/view/Window;

    .line 104
    .line 105
    iget-boolean v4, p3, La1/h;->C:Z

    .line 106
    .line 107
    if-eqz v4, :cond_9

    .line 108
    .line 109
    iget-boolean v4, p3, La1/h;->A:Z

    .line 110
    .line 111
    if-ne v0, v4, :cond_9

    .line 112
    .line 113
    iget-boolean v4, p3, La1/h;->B:Z

    .line 114
    .line 115
    if-eq p1, v4, :cond_8

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_8
    move v4, v3

    .line 119
    goto :goto_6

    .line 120
    :cond_9
    :goto_5
    move v4, v1

    .line 121
    :goto_6
    iput-boolean v0, p3, La1/h;->A:Z

    .line 122
    .line 123
    iput-boolean p1, p3, La1/h;->B:Z

    .line 124
    .line 125
    if-eqz v4, :cond_c

    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    const/4 v5, -0x2

    .line 132
    if-eqz v0, :cond_a

    .line 133
    .line 134
    move v0, v5

    .line 135
    goto :goto_7

    .line 136
    :cond_a
    const/4 v0, -0x1

    .line 137
    :goto_7
    iget v4, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 138
    .line 139
    if-ne v0, v4, :cond_b

    .line 140
    .line 141
    iget-boolean v4, p3, La1/h;->C:Z

    .line 142
    .line 143
    if-nez v4, :cond_c

    .line 144
    .line 145
    :cond_b
    invoke-virtual {v2, v0, v5}, Landroid/view/Window;->setLayout(II)V

    .line 146
    .line 147
    .line 148
    iput-boolean v1, p3, La1/h;->C:Z

    .line 149
    .line 150
    :cond_c
    iget-boolean p2, p2, La1/i;->b:Z

    .line 151
    .line 152
    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    if-eqz p2, :cond_f

    .line 160
    .line 161
    if-eqz p1, :cond_d

    .line 162
    .line 163
    goto :goto_8

    .line 164
    :cond_d
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 165
    .line 166
    const/16 p3, 0x1f

    .line 167
    .line 168
    if-ge p1, p3, :cond_e

    .line 169
    .line 170
    const/16 v3, 0x10

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_e
    const/16 v3, 0x30

    .line 174
    .line 175
    :goto_8
    invoke-virtual {p2, v3}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 176
    .line 177
    .line 178
    :cond_f
    return-void
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La1/j;->u:La1/i;

    .line 2
    .line 3
    iget-boolean v0, v0, La1/i;->a:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x6f

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, La1/j;->t:LB5/a;

    .line 24
    .line 25
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La1/j;->u:La1/i;

    .line 6
    .line 7
    iget-boolean v1, v1, La1/i;->b:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, La1/j;->w:La1/h;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-static {v2}, Ljava/lang/Float;->isInfinite(F)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-nez v3, :cond_1

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-nez v2, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    add-int/2addr v4, v3

    .line 65
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/2addr v3, v4

    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    add-int/2addr v5, v1

    .line 79
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    add-int/2addr v1, v5

    .line 84
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-static {v2}, LD5/a;->G(F)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-gt v4, v2, :cond_1

    .line 93
    .line 94
    if-gt v2, v3, :cond_1

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-static {p1}, LD5/a;->G(F)I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-gt v5, p1, :cond_1

    .line 105
    .line 106
    if-gt p1, v1, :cond_1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    :goto_0
    iget-object p1, p0, La1/j;->t:LB5/a;

    .line 110
    .line 111
    invoke-interface {p1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    const/4 p1, 0x1

    .line 115
    return p1

    .line 116
    :cond_2
    :goto_1
    return v0
.end method
