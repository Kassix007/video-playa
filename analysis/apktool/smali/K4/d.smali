.class public LK4/d;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:F

.field public C:I

.field public D:Landroid/content/res/ColorStateList;

.field public E:Landroid/graphics/PorterDuff$Mode;

.field public F:Landroid/graphics/PorterDuffColorFilter;

.field public G:Landroid/graphics/ColorFilter;

.field public a:Landroid/content/res/Resources;

.field public b:Landroid/content/res/Resources$Theme;

.field public final c:LK4/b;

.field public final d:LK4/b;

.field public final e:LK4/b;

.field public final f:LK4/b;

.field public final g:Landroid/graphics/Rect;

.field public final h:Landroid/graphics/RectF;

.field public final i:Landroid/graphics/Path;

.field public j:I

.field public k:LO4/a;

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:I

.field public p:I

.field public q:Z

.field public r:Z

.field public s:F

.field public t:F

.field public u:I

.field public v:I

.field public w:I

.field public x:I

.field public y:I

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 2
    new-instance v0, LK4/b;

    new-instance v1, Landroid/text/TextPaint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/text/TextPaint;-><init>(I)V

    invoke-direct {v0, v1}, LK4/b;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, LK4/d;->c:LK4/b;

    .line 3
    new-instance v3, LK4/b;

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4, v2}, Landroid/graphics/Paint;-><init>(I)V

    invoke-direct {v3, v4}, LK4/b;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, p0, LK4/d;->d:LK4/b;

    .line 4
    new-instance v3, LK4/b;

    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5, v2}, Landroid/graphics/Paint;-><init>(I)V

    invoke-direct {v3, v5}, LK4/b;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, p0, LK4/d;->e:LK4/b;

    .line 5
    new-instance v3, LK4/b;

    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5, v2}, Landroid/graphics/Paint;-><init>(I)V

    invoke-direct {v3, v5}, LK4/b;-><init>(Landroid/graphics/Paint;)V

    iput-object v3, p0, LK4/d;->f:LK4/b;

    .line 6
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iput-object v3, p0, LK4/d;->g:Landroid/graphics/Rect;

    .line 7
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, p0, LK4/d;->h:Landroid/graphics/RectF;

    .line 8
    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    iput-object v3, p0, LK4/d;->i:Landroid/graphics/Path;

    const/16 v3, 0xff

    .line 9
    iput v3, p0, LK4/d;->j:I

    .line 10
    iput-boolean v2, p0, LK4/d;->m:Z

    .line 11
    iput-boolean v2, p0, LK4/d;->n:Z

    const/4 v2, -0x1

    .line 12
    iput v2, p0, LK4/d;->o:I

    .line 13
    iput v2, p0, LK4/d;->p:I

    .line 14
    sget-object v2, LK4/a;->a:Ljava/util/HashMap;

    const/high16 v2, -0x40800000    # -1.0f

    .line 15
    iput v2, p0, LK4/d;->s:F

    .line 16
    iput v2, p0, LK4/d;->t:F

    .line 17
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, p0, LK4/d;->E:Landroid/graphics/PorterDuff$Mode;

    const/high16 v2, -0x1000000

    .line 18
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 19
    iput-object v2, v0, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 20
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    const/4 v0, 0x0

    .line 22
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 23
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v5, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 24
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 25
    iput-object p1, p0, LK4/d;->a:Landroid/content/res/Resources;

    .line 26
    iput-object p2, p0, LK4/d;->b:Landroid/content/res/Resources$Theme;

    return-void
.end method

.method public constructor <init>(Lcom/web2native/MainActivity;LO4/a;)V
    .locals 2

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Lh/h;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "context.resources"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    invoke-direct {p0, v0, v1}, LK4/d;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 28
    sget-object v0, LK4/a;->a:Ljava/util/HashMap;

    .line 29
    sget-object v0, LO4/c;->b:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sput-object p1, LO4/c;->b:Landroid/content/Context;

    .line 31
    :cond_0
    sget-object p1, LO4/c;->c:Ljava/util/HashMap;

    .line 32
    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 33
    sget-object p1, LK4/a;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "At least one font needs to be registered first\n    via "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    const-class v1, LK4/a;

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    const-string v1, ".registerFont(Iconics.kt:117)"

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    :cond_1
    :try_start_0
    sget-object p1, LO4/c;->b:Landroid/content/Context;

    if-eqz p1, :cond_2

    goto :goto_0

    .line 40
    :cond_2
    const-string p1, "A \'Iconics.init(context)\' has to happen first. Call from your application. Usually this happens via an \'IconicsDrawable\' usage."

    .line 41
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    .line 42
    invoke-static {p1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    move-result-object p1

    .line 43
    :goto_0
    instance-of p1, p1, Lm5/l;

    if-eqz p1, :cond_3

    .line 44
    const-string p1, "IconicsDrawable"

    const-string v0, "Iconics.init() not yet executed, icon will be missing"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    :cond_3
    invoke-virtual {p0, p2}, LK4/d;->e(LO4/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LK4/d;->m:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, LK4/d;->g:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    int-to-float v1, v1

    .line 8
    iget-object v2, p0, LK4/d;->h:Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    sub-float/2addr v1, v3

    .line 15
    const/4 v3, 0x2

    .line 16
    int-to-float v3, v3

    .line 17
    div-float/2addr v1, v3

    .line 18
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-float/2addr v0, v2

    .line 28
    div-float/2addr v0, v3

    .line 29
    iget v2, p0, LK4/d;->x:I

    .line 30
    .line 31
    int-to-float v2, v2

    .line 32
    add-float/2addr v1, v2

    .line 33
    iget v2, p0, LK4/d;->y:I

    .line 34
    .line 35
    int-to-float v2, v2

    .line 36
    add-float/2addr v0, v2

    .line 37
    iget-object v2, p0, LK4/d;->i:Landroid/graphics/Path;

    .line 38
    .line 39
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Path;->offset(FF)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final c(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 1
    iget-object v0, p0, LK4/d;->e:LK4/b;

    .line 2
    .line 3
    iput-object p1, v0, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-boolean p1, p0, LK4/d;->m:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, p0, LK4/d;->m:Z

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 11
    .line 12
    .line 13
    iget v1, p0, LK4/d;->s:F

    .line 14
    .line 15
    const/high16 v2, -0x40800000    # -1.0f

    .line 16
    .line 17
    cmpg-float v1, v1, v2

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    iput v3, p0, LK4/d;->s:F

    .line 23
    .line 24
    invoke-virtual {p0}, LK4/d;->a()V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget v1, p0, LK4/d;->t:F

    .line 28
    .line 29
    cmpg-float v1, v1, v2

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    iput v3, p0, LK4/d;->t:F

    .line 34
    .line 35
    invoke-virtual {p0}, LK4/d;->a()V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-boolean p1, p0, LK4/d;->m:Z

    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, LK4/b;->a([I)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, LK4/d;->a()V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public final clearColorFilter()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LK4/d;->G:Landroid/graphics/ColorFilter;

    .line 3
    .line 4
    invoke-virtual {p0}, LK4/d;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LK4/d;->r:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, LK4/d;->r:Z

    .line 6
    .line 7
    iget v0, p0, LK4/d;->u:I

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, -0x1

    .line 14
    :goto_0
    iget v1, p0, LK4/d;->w:I

    .line 15
    .line 16
    mul-int/2addr p1, v1

    .line 17
    mul-int/lit8 p1, p1, 0x2

    .line 18
    .line 19
    add-int/2addr p1, v0

    .line 20
    invoke-virtual {p0, p1}, LK4/d;->f(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LK4/d;->a()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    iget-object v0, p0, LK4/d;->i:Landroid/graphics/Path;

    .line 2
    .line 3
    const-string v1, "canvas"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LK4/d;->k:LO4/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "bounds"

    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, LK4/d;->h(Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1}, LK4/d;->i(Landroid/graphics/Rect;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LK4/d;->b()V

    .line 29
    .line 30
    .line 31
    iget-boolean v2, p0, LK4/d;->l:Z

    .line 32
    .line 33
    const/high16 v3, -0x40800000    # -1.0f

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLayoutDirection()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/4 v5, 0x1

    .line 43
    if-ne v2, v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget v5, v5, Landroid/graphics/Rect;->left:I

    .line 56
    .line 57
    sub-int/2addr v2, v5

    .line 58
    int-to-float v2, v2

    .line 59
    invoke-virtual {p1, v2, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 60
    .line 61
    .line 62
    const/high16 v2, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-virtual {p1, v3, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget v2, p0, LK4/d;->t:F

    .line 68
    .line 69
    cmpl-float v2, v2, v3

    .line 70
    .line 71
    if-lez v2, :cond_3

    .line 72
    .line 73
    iget v2, p0, LK4/d;->s:F

    .line 74
    .line 75
    cmpl-float v2, v2, v3

    .line 76
    .line 77
    if-lez v2, :cond_3

    .line 78
    .line 79
    iget-boolean v2, p0, LK4/d;->r:Z

    .line 80
    .line 81
    iget-object v3, p0, LK4/d;->e:LK4/b;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    iget v2, p0, LK4/d;->w:I

    .line 86
    .line 87
    div-int/lit8 v2, v2, 0x2

    .line 88
    .line 89
    int-to-float v2, v2

    .line 90
    new-instance v4, Landroid/graphics/RectF;

    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    int-to-float v5, v5

    .line 97
    sub-float/2addr v5, v2

    .line 98
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    int-to-float v1, v1

    .line 103
    sub-float/2addr v1, v2

    .line 104
    invoke-direct {v4, v2, v2, v5, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 105
    .line 106
    .line 107
    iget v1, p0, LK4/d;->s:F

    .line 108
    .line 109
    iget v2, p0, LK4/d;->t:F

    .line 110
    .line 111
    iget-object v3, v3, LK4/b;->a:Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-virtual {p1, v4, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 114
    .line 115
    .line 116
    iget v1, p0, LK4/d;->s:F

    .line 117
    .line 118
    iget v2, p0, LK4/d;->t:F

    .line 119
    .line 120
    iget-object v3, p0, LK4/d;->d:LK4/b;

    .line 121
    .line 122
    iget-object v3, v3, LK4/b;->a:Landroid/graphics/Paint;

    .line 123
    .line 124
    invoke-virtual {p1, v4, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_2
    new-instance v2, Landroid/graphics/RectF;

    .line 129
    .line 130
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    int-to-float v5, v5

    .line 135
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    int-to-float v1, v1

    .line 140
    invoke-direct {v2, v4, v4, v5, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 141
    .line 142
    .line 143
    iget v1, p0, LK4/d;->s:F

    .line 144
    .line 145
    iget v4, p0, LK4/d;->t:F

    .line 146
    .line 147
    iget-object v3, v3, LK4/b;->a:Landroid/graphics/Paint;

    .line 148
    .line 149
    invoke-virtual {p1, v2, v1, v4, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    :cond_3
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catchall_0
    move-exception v1

    .line 157
    invoke-static {v1}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 158
    .line 159
    .line 160
    :goto_1
    iget-boolean v1, p0, LK4/d;->q:Z

    .line 161
    .line 162
    if-eqz v1, :cond_4

    .line 163
    .line 164
    iget-object v1, p0, LK4/d;->f:LK4/b;

    .line 165
    .line 166
    iget-object v1, v1, LK4/b;->a:Landroid/graphics/Paint;

    .line 167
    .line 168
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 169
    .line 170
    .line 171
    :cond_4
    iget-object v1, p0, LK4/d;->c:LK4/b;

    .line 172
    .line 173
    iget-object v2, v1, LK4/b;->a:Landroid/graphics/Paint;

    .line 174
    .line 175
    check-cast v2, Landroid/text/TextPaint;

    .line 176
    .line 177
    iget-object v3, p0, LK4/d;->G:Landroid/graphics/ColorFilter;

    .line 178
    .line 179
    if-nez v3, :cond_5

    .line 180
    .line 181
    iget-object v3, p0, LK4/d;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 182
    .line 183
    :cond_5
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 184
    .line 185
    .line 186
    iget-object v1, v1, LK4/b;->a:Landroid/graphics/Paint;

    .line 187
    .line 188
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 189
    .line 190
    .line 191
    return-void
.end method

.method public final e(LO4/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, LK4/d;->k:LO4/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, LO4/a;->b()LO4/b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, LO4/b;->getRawTypeface()Landroid/graphics/Typeface;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    iget-object v0, p0, LK4/d;->c:LK4/b;

    .line 18
    .line 19
    iget-object v0, v0, LK4/b;->a:Landroid/graphics/Paint;

    .line 20
    .line 21
    check-cast v0, Landroid/text/TextPaint;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, LK4/d;->a()V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LK4/d;->k:LO4/a;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, LK4/d;->a()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final f(I)V
    .locals 1

    .line 1
    iget v0, p0, LK4/d;->u:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, LK4/d;->q:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, LK4/d;->v:I

    .line 10
    .line 11
    add-int/2addr p1, v0

    .line 12
    :cond_0
    iget-boolean v0, p0, LK4/d;->r:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget v0, p0, LK4/d;->w:I

    .line 17
    .line 18
    add-int/2addr p1, v0

    .line 19
    :cond_1
    iput p1, p0, LK4/d;->u:I

    .line 20
    .line 21
    invoke-virtual {p0}, LK4/d;->a()V

    .line 22
    .line 23
    .line 24
    :cond_2
    return-void
.end method

.method public final g([I)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method public final getAlpha()I
    .locals 1

    .line 1
    iget v0, p0, LK4/d;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    iget v0, p0, LK4/d;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    iget v0, p0, LK4/d;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final getOpacity()I
    .locals 2

    .line 1
    iget-object v0, p0, LK4/d;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, LK4/d;->G:Landroid/graphics/ColorFilter;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget v0, p0, LK4/d;->j:I

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    const/16 v1, 0xff

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, -0x1

    .line 20
    return v0

    .line 21
    :cond_2
    const/4 v0, -0x2

    .line 22
    return v0

    .line 23
    :cond_3
    :goto_0
    const/4 v0, -0x3

    .line 24
    return v0
.end method

.method public final h(Landroid/graphics/Rect;)V
    .locals 4

    .line 1
    iget v0, p0, LK4/d;->u:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    mul-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-gt v0, v1, :cond_0

    .line 12
    .line 13
    iget v0, p0, LK4/d;->u:I

    .line 14
    .line 15
    mul-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-gt v0, v1, :cond_0

    .line 22
    .line 23
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 24
    .line 25
    iget v1, p0, LK4/d;->u:I

    .line 26
    .line 27
    add-int/2addr v0, v1

    .line 28
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 29
    .line 30
    add-int/2addr v2, v1

    .line 31
    iget v3, p1, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    sub-int/2addr v3, v1

    .line 34
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    sub-int/2addr p1, v1

    .line 37
    iget-object v1, p0, LK4/d;->g:Landroid/graphics/Rect;

    .line 38
    .line 39
    invoke-virtual {v1, v0, v2, v3, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public final i(Landroid/graphics/Rect;)V
    .locals 11

    .line 1
    iget-object p1, p0, LK4/d;->k:LO4/a;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-interface {p1}, LO4/a;->a()C

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Character;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    move-object v1, p1

    .line 21
    goto :goto_2

    .line 22
    :cond_1
    :goto_1
    const-string p1, "null"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_2
    iget-object p1, p0, LK4/d;->g:Landroid/graphics/Rect;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    int-to-float v7, v0

    .line 32
    iget-object v0, p0, LK4/d;->c:LK4/b;

    .line 33
    .line 34
    iget-object v2, v0, LK4/b;->a:Landroid/graphics/Paint;

    .line 35
    .line 36
    iget-object v8, v0, LK4/b;->a:Landroid/graphics/Paint;

    .line 37
    .line 38
    check-cast v2, Landroid/text/TextPaint;

    .line 39
    .line 40
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 41
    .line 42
    .line 43
    move-object v0, v8

    .line 44
    check-cast v0, Landroid/text/TextPaint;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v2, 0x0

    .line 53
    iget-object v6, p0, LK4/d;->i:Landroid/graphics/Path;

    .line 54
    .line 55
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 56
    .line 57
    .line 58
    iget-object v9, p0, LK4/d;->h:Landroid/graphics/RectF;

    .line 59
    .line 60
    const/4 v10, 0x1

    .line 61
    invoke-virtual {v6, v9, v10}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-float v0, v0

    .line 69
    invoke-virtual {v9}, Landroid/graphics/RectF;->width()F

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    div-float/2addr v0, v2

    .line 74
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    int-to-float v2, v2

    .line 79
    invoke-virtual {v9}, Landroid/graphics/RectF;->height()F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    div-float/2addr v2, v3

    .line 84
    cmpg-float v3, v0, v2

    .line 85
    .line 86
    if-gez v3, :cond_2

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_2
    move v0, v2

    .line 90
    :goto_3
    mul-float/2addr v7, v0

    .line 91
    move-object v0, v8

    .line 92
    check-cast v0, Landroid/text/TextPaint;

    .line 93
    .line 94
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 95
    .line 96
    .line 97
    move-object v0, v8

    .line 98
    check-cast v0, Landroid/text/TextPaint;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v2, 0x0

    .line 107
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6, v9, v10}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 111
    .line 112
    .line 113
    iget v0, p1, Landroid/graphics/Rect;->left:I

    .line 114
    .line 115
    int-to-float v0, v0

    .line 116
    iget v1, v9, Landroid/graphics/RectF;->left:F

    .line 117
    .line 118
    sub-float/2addr v0, v1

    .line 119
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 120
    .line 121
    int-to-float p1, p1

    .line 122
    iget v1, v9, Landroid/graphics/RectF;->top:F

    .line 123
    .line 124
    sub-float/2addr p1, v1

    .line 125
    invoke-virtual {v6, v0, p1}, Landroid/graphics/Path;->offset(FF)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 35

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    const-string v4, "r"

    .line 10
    .line 11
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v4, "parser"

    .line 15
    .line 16
    move-object/from16 v5, p2

    .line 17
    .line 18
    invoke-static {v5, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v4, "attrs"

    .line 22
    .line 23
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-super/range {p0 .. p4}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, v1, LK4/d;->a:Landroid/content/res/Resources;

    .line 30
    .line 31
    iput-object v3, v1, LK4/d;->b:Landroid/content/res/Resources$Theme;

    .line 32
    .line 33
    sget-object v4, LN4/a;->a:[I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    if-nez v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v2, v4}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-string v4, "{\n            res.obtain\u2026tes(set, attrs)\n        }"

    .line 43
    .line 44
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v3, v2, v4, v5, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    const-string v4, "theme.obtainStyledAttributes(set, attrs, 0, 0)"

    .line 53
    .line 54
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    new-instance v4, Lk3/d;

    .line 58
    .line 59
    invoke-direct {v4, v0, v3, v2}, Lk3/d;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/content/res/TypedArray;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, LB0/a;

    .line 63
    .line 64
    const/16 v3, 0x12

    .line 65
    .line 66
    invoke-direct {v0, v3, v4}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput-boolean v5, v1, LK4/d;->m:Z

    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, LB0/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    iput-boolean v3, v1, LK4/d;->m:Z

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    invoke-static {v0}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_2

    .line 97
    .line 98
    :cond_1
    move-object/from16 p3, v2

    .line 99
    .line 100
    goto/16 :goto_c

    .line 101
    .line 102
    :cond_2
    const-string v4, "\\|"

    .line 103
    .line 104
    invoke-static {v4}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    const-string v6, "compile(...)"

    .line 109
    .line 110
    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-nez v6, :cond_3

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    new-instance v6, Ljava/util/ArrayList;

    .line 133
    .line 134
    const/16 v7, 0xa

    .line 135
    .line 136
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    move v7, v5

    .line 140
    :goto_1
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->start()I

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v7

    .line 152
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->end()I

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-nez v8, :cond_e

    .line 164
    .line 165
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    invoke-virtual {v0, v7, v4}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-object v0, v6

    .line 181
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    if-nez v4, :cond_5

    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    invoke-interface {v0, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    :goto_3
    invoke-interface {v4}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-eqz v6, :cond_5

    .line 200
    .line 201
    invoke-interface {v4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    check-cast v6, Ljava/lang/String;

    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 208
    .line 209
    .line 210
    move-result v6

    .line 211
    if-nez v6, :cond_4

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_4
    check-cast v0, Ljava/lang/Iterable;

    .line 215
    .line 216
    invoke-interface {v4}, Ljava/util/ListIterator;->nextIndex()I

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    add-int/2addr v4, v3

    .line 221
    invoke-static {v0, v4}, Ln5/l;->y0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    goto :goto_4

    .line 226
    :cond_5
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 227
    .line 228
    :goto_4
    check-cast v0, Ljava/lang/Iterable;

    .line 229
    .line 230
    new-instance v4, Ljava/util/ArrayList;

    .line 231
    .line 232
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 233
    .line 234
    .line 235
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    :cond_6
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    const/4 v7, 0x0

    .line 244
    if-eqz v0, :cond_a

    .line 245
    .line 246
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    move-object v8, v0

    .line 251
    check-cast v8, Ljava/lang/String;

    .line 252
    .line 253
    const-string v9, "Can\'t create processor for animation tag "

    .line 254
    .line 255
    const-string v10, "TAG"

    .line 256
    .line 257
    sget-object v11, LK4/a;->b:Ljava/lang/String;

    .line 258
    .line 259
    sget-object v12, LK4/a;->c:LQ4/a;

    .line 260
    .line 261
    const-string v0, "animationTag"

    .line 262
    .line 263
    invoke-static {v8, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    sget-object v0, LK4/a;->a:Ljava/util/HashMap;

    .line 267
    .line 268
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    move-object v13, v0

    .line 273
    check-cast v13, Ljava/lang/Class;

    .line 274
    .line 275
    if-eqz v13, :cond_9

    .line 276
    .line 277
    :try_start_0
    const-string v0, "INSTANCE"

    .line 278
    .line 279
    invoke-virtual {v13, v0}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 280
    .line 281
    .line 282
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 283
    goto :goto_6

    .line 284
    :catchall_0
    move-exception v0

    .line 285
    :try_start_1
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    :goto_6
    instance-of v14, v0, Lm5/l;

    .line 290
    .line 291
    if-eqz v14, :cond_7

    .line 292
    .line 293
    move-object v0, v7

    .line 294
    :cond_7
    check-cast v0, Ljava/lang/reflect/Field;

    .line 295
    .line 296
    if-eqz v0, :cond_8

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 299
    .line 300
    .line 301
    move-result v14

    .line 302
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 303
    .line 304
    .line 305
    move-result v14

    .line 306
    if-eqz v14, :cond_8

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 309
    .line 310
    .line 311
    move-result v14

    .line 312
    invoke-static {v14}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 313
    .line 314
    .line 315
    move-result v14

    .line 316
    if-eqz v14, :cond_8

    .line 317
    .line 318
    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    const-string v13, "null cannot be cast to non-null type T of com.mikepenz.iconics.context.ReflectionUtils.getInstanceOf"

    .line 323
    .line 324
    invoke-static {v0, v13}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catch_0
    move-exception v0

    .line 329
    goto :goto_8

    .line 330
    :catch_1
    move-exception v0

    .line 331
    goto :goto_9

    .line 332
    :cond_8
    invoke-virtual {v13}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v13, "{\n            // This is\u2026s.newInstance()\n        }"

    .line 337
    .line 338
    invoke-static {v0, v13}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :goto_7
    check-cast v0, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 342
    .line 343
    move-object v7, v0

    .line 344
    goto :goto_a

    .line 345
    :goto_8
    invoke-static {v11, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-virtual {v12, v11, v8, v0}, LQ4/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ReflectiveOperationException;)V

    .line 353
    .line 354
    .line 355
    goto :goto_a

    .line 356
    :goto_9
    invoke-static {v11, v10}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v8

    .line 363
    invoke-virtual {v12, v11, v8, v0}, LQ4/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ReflectiveOperationException;)V

    .line 364
    .line 365
    .line 366
    :cond_9
    :goto_a
    if-eqz v7, :cond_6

    .line 367
    .line 368
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    goto/16 :goto_5

    .line 372
    .line 373
    :cond_a
    new-instance v0, LL4/c;

    .line 374
    .line 375
    iget-object v6, v1, LK4/d;->a:Landroid/content/res/Resources;

    .line 376
    .line 377
    const-string v8, "res"

    .line 378
    .line 379
    if-eqz v6, :cond_d

    .line 380
    .line 381
    iget-object v9, v1, LK4/d;->b:Landroid/content/res/Resources$Theme;

    .line 382
    .line 383
    invoke-direct {v0, v6, v9}, LL4/c;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 384
    .line 385
    .line 386
    iget-object v6, v1, LK4/d;->a:Landroid/content/res/Resources;

    .line 387
    .line 388
    if-eqz v6, :cond_c

    .line 389
    .line 390
    iget-object v6, v1, LK4/d;->c:LK4/b;

    .line 391
    .line 392
    iget-object v8, v6, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 393
    .line 394
    iget-object v6, v6, LK4/b;->a:Landroid/graphics/Paint;

    .line 395
    .line 396
    check-cast v6, Landroid/text/TextPaint;

    .line 397
    .line 398
    invoke-virtual {v6}, Landroid/graphics/Paint;->getStyle()Landroid/graphics/Paint$Style;

    .line 399
    .line 400
    .line 401
    move-result-object v9

    .line 402
    const-string v6, "iconBrush.paint.style"

    .line 403
    .line 404
    invoke-static {v9, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    iget-object v6, v1, LK4/d;->c:LK4/b;

    .line 408
    .line 409
    iget-object v6, v6, LK4/b;->a:Landroid/graphics/Paint;

    .line 410
    .line 411
    check-cast v6, Landroid/text/TextPaint;

    .line 412
    .line 413
    invoke-virtual {v6}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    iget-object v6, v1, LK4/d;->d:LK4/b;

    .line 418
    .line 419
    iget-object v11, v6, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 420
    .line 421
    iget-object v6, v1, LK4/d;->e:LK4/b;

    .line 422
    .line 423
    iget-object v12, v6, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 424
    .line 425
    iget-object v6, v1, LK4/d;->f:LK4/b;

    .line 426
    .line 427
    iget-object v13, v6, LK4/b;->c:Landroid/content/res/ColorStateList;

    .line 428
    .line 429
    iget v14, v1, LK4/d;->j:I

    .line 430
    .line 431
    iget-object v15, v1, LK4/d;->k:LO4/a;

    .line 432
    .line 433
    iget-boolean v6, v1, LK4/d;->l:Z

    .line 434
    .line 435
    iget v7, v1, LK4/d;->o:I

    .line 436
    .line 437
    iget v3, v1, LK4/d;->p:I

    .line 438
    .line 439
    iget-boolean v5, v1, LK4/d;->q:Z

    .line 440
    .line 441
    move-object/from16 p3, v2

    .line 442
    .line 443
    iget-boolean v2, v1, LK4/d;->r:Z

    .line 444
    .line 445
    move/from16 v20, v2

    .line 446
    .line 447
    iget v2, v1, LK4/d;->s:F

    .line 448
    .line 449
    move/from16 v21, v2

    .line 450
    .line 451
    iget v2, v1, LK4/d;->t:F

    .line 452
    .line 453
    move/from16 v22, v2

    .line 454
    .line 455
    iget v2, v1, LK4/d;->u:I

    .line 456
    .line 457
    move/from16 v23, v2

    .line 458
    .line 459
    iget v2, v1, LK4/d;->v:I

    .line 460
    .line 461
    move/from16 v24, v2

    .line 462
    .line 463
    iget v2, v1, LK4/d;->w:I

    .line 464
    .line 465
    move/from16 v25, v2

    .line 466
    .line 467
    iget v2, v1, LK4/d;->x:I

    .line 468
    .line 469
    move/from16 v26, v2

    .line 470
    .line 471
    iget v2, v1, LK4/d;->y:I

    .line 472
    .line 473
    move/from16 v27, v2

    .line 474
    .line 475
    iget v2, v1, LK4/d;->z:F

    .line 476
    .line 477
    move/from16 v28, v2

    .line 478
    .line 479
    iget v2, v1, LK4/d;->A:F

    .line 480
    .line 481
    move/from16 v29, v2

    .line 482
    .line 483
    iget v2, v1, LK4/d;->B:F

    .line 484
    .line 485
    move/from16 v30, v2

    .line 486
    .line 487
    iget v2, v1, LK4/d;->C:I

    .line 488
    .line 489
    move/from16 v31, v2

    .line 490
    .line 491
    iget-object v2, v1, LK4/d;->D:Landroid/content/res/ColorStateList;

    .line 492
    .line 493
    move-object/from16 v32, v2

    .line 494
    .line 495
    iget-object v2, v1, LK4/d;->E:Landroid/graphics/PorterDuff$Mode;

    .line 496
    .line 497
    move/from16 v18, v3

    .line 498
    .line 499
    iget-object v3, v1, LK4/d;->G:Landroid/graphics/ColorFilter;

    .line 500
    .line 501
    const-string v1, "tintPorterMode"

    .line 502
    .line 503
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    move/from16 v17, v7

    .line 507
    .line 508
    new-instance v7, LK4/c;

    .line 509
    .line 510
    move-object/from16 v33, v2

    .line 511
    .line 512
    move-object/from16 v34, v3

    .line 513
    .line 514
    move/from16 v19, v5

    .line 515
    .line 516
    move/from16 v16, v6

    .line 517
    .line 518
    invoke-direct/range {v7 .. v34}, LK4/c;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/Paint$Style;Landroid/graphics/Typeface;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILO4/a;ZIIZZFFIIIIIFFFILandroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Landroid/graphics/ColorFilter;)V

    .line 519
    .line 520
    .line 521
    const/4 v1, 0x0

    .line 522
    iput-boolean v1, v0, LK4/d;->m:Z

    .line 523
    .line 524
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v7, v0}, LK4/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 528
    .line 529
    .line 530
    const/4 v2, 0x1

    .line 531
    iput-boolean v2, v0, LK4/d;->m:Z

    .line 532
    .line 533
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 537
    .line 538
    .line 539
    new-array v2, v1, [Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 540
    .line 541
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    const-string v3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    .line 546
    .line 547
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    check-cast v2, [Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 551
    .line 552
    array-length v3, v2

    .line 553
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    check-cast v2, [Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;

    .line 558
    .line 559
    const-string v3, "processors"

    .line 560
    .line 561
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    array-length v3, v2

    .line 565
    if-nez v3, :cond_b

    .line 566
    .line 567
    goto :goto_c

    .line 568
    :cond_b
    array-length v3, v2

    .line 569
    move v5, v1

    .line 570
    :goto_b
    if-ge v5, v3, :cond_f

    .line 571
    .line 572
    aget-object v1, v2, v5

    .line 573
    .line 574
    const-string v4, "processor"

    .line 575
    .line 576
    invoke-static {v1, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1, v0}, Lcom/mikepenz/iconics/animation/IconicsAnimationProcessor;->setDrawable$iconics_core(LL4/c;)V

    .line 580
    .line 581
    .line 582
    iget-object v4, v0, LL4/c;->H:Ljava/util/ArrayList;

    .line 583
    .line 584
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    add-int/lit8 v5, v5, 0x1

    .line 588
    .line 589
    goto :goto_b

    .line 590
    :cond_c
    invoke-static {v8}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    throw v7

    .line 594
    :cond_d
    invoke-static {v8}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    throw v7

    .line 598
    :cond_e
    move-object/from16 p3, v2

    .line 599
    .line 600
    move-object/from16 v1, p0

    .line 601
    .line 602
    goto/16 :goto_1

    .line 603
    .line 604
    :cond_f
    :goto_c
    invoke-virtual/range {p3 .. p3}, Landroid/content/res/TypedArray;->recycle()V

    .line 605
    .line 606
    .line 607
    return-void
.end method

.method public final isStateful()Z
    .locals 2

    .line 1
    iget-object v0, p0, LK4/d;->c:LK4/b;

    .line 2
    .line 3
    invoke-virtual {v0}, LK4/b;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LK4/d;->f:LK4/b;

    .line 11
    .line 12
    invoke-virtual {v0}, LK4/b;->b()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LK4/d;->e:LK4/b;

    .line 19
    .line 20
    invoke-virtual {v0}, LK4/b;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, LK4/d;->d:LK4/b;

    .line 27
    .line 28
    invoke-virtual {v0}, LK4/b;->b()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, LK4/d;->D:Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne v0, v1, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const/4 v0, 0x0

    .line 46
    return v0

    .line 47
    :cond_1
    :goto_0
    return v1
.end method

.method public final j()V
    .locals 5

    .line 1
    iget-boolean v0, p0, LK4/d;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LK4/d;->c:LK4/b;

    .line 6
    .line 7
    iget-object v0, v0, LK4/b;->a:Landroid/graphics/Paint;

    .line 8
    .line 9
    check-cast v0, Landroid/text/TextPaint;

    .line 10
    .line 11
    iget v1, p0, LK4/d;->z:F

    .line 12
    .line 13
    iget v2, p0, LK4/d;->A:F

    .line 14
    .line 15
    iget v3, p0, LK4/d;->B:F

    .line 16
    .line 17
    iget v4, p0, LK4/d;->C:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LK4/d;->a()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, LK4/d;->D:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v1, p0, LK4/d;->E:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, LK4/d;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v0, v2, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, LK4/d;->F:Landroid/graphics/PorterDuffColorFilter;

    .line 26
    .line 27
    return-void
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "bounds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LK4/d;->h(Landroid/graphics/Rect;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, LK4/d;->i(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, LK4/d;->b()V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, LK4/d;->i:Landroid/graphics/Path;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 4

    .line 1
    const-string v0, "stateSet"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK4/d;->c:LK4/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LK4/b;->a([I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, LK4/d;->f:LK4/b;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, LK4/b;->a([I)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    move v0, v3

    .line 28
    :goto_1
    iget-object v1, p0, LK4/d;->e:LK4/b;

    .line 29
    .line 30
    invoke-virtual {v1, p1}, LK4/b;->a([I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move v0, v2

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    :goto_2
    move v0, v3

    .line 42
    :goto_3
    iget-object v1, p0, LK4/d;->d:LK4/b;

    .line 43
    .line 44
    invoke-virtual {v1, p1}, LK4/b;->a([I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_4

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    :cond_4
    move v2, v3

    .line 53
    :cond_5
    iget-object p1, p0, LK4/d;->D:Landroid/content/res/ColorStateList;

    .line 54
    .line 55
    if-eqz p1, :cond_6

    .line 56
    .line 57
    invoke-virtual {p0}, LK4/d;->k()V

    .line 58
    .line 59
    .line 60
    return v3

    .line 61
    :cond_6
    return v2
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LK4/d;->c:LK4/b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LK4/b;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK4/d;->f:LK4/b;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LK4/b;->c(I)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LK4/d;->e:LK4/b;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LK4/b;->c(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LK4/d;->d:LK4/b;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, LK4/b;->c(I)V

    .line 19
    .line 20
    .line 21
    iput p1, p0, LK4/d;->j:I

    .line 22
    .line 23
    invoke-virtual {p0}, LK4/d;->a()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK4/d;->G:Landroid/graphics/ColorFilter;

    .line 2
    .line 3
    invoke-virtual {p0}, LK4/d;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setState([I)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LK4/d;->g([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, LK4/d;->c:LK4/b;

    .line 9
    .line 10
    invoke-virtual {p1}, LK4/b;->b()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, LK4/d;->f:LK4/b;

    .line 17
    .line 18
    invoke-virtual {p1}, LK4/b;->b()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, LK4/d;->e:LK4/b;

    .line 25
    .line 26
    invoke-virtual {p1}, LK4/b;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, LK4/d;->d:LK4/b;

    .line 33
    .line 34
    invoke-virtual {p1}, LK4/b;->b()Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, LK4/d;->D:Landroid/content/res/ColorStateList;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne p1, v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p1, 0x0

    .line 52
    return p1

    .line 53
    :cond_1
    :goto_0
    return v0
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK4/d;->D:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, LK4/d;->k()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LK4/d;->a()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    :cond_0
    const-string v0, "value"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, LK4/d;->E:Landroid/graphics/PorterDuff$Mode;

    .line 11
    .line 12
    invoke-virtual {p0}, LK4/d;->k()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, LK4/d;->a()V

    .line 16
    .line 17
    .line 18
    return-void
.end method
