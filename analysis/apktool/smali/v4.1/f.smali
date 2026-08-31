.class public final Lv4/f;
.super Ls4/f;
.source "SourceFile"


# instance fields
.field public final q:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Ls4/k;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls4/f;-><init>(Ls4/k;)V

    .line 2
    iput-object p2, p0, Lv4/f;->q:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lv4/f;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ls4/f;-><init>(Ls4/f;)V

    .line 4
    iget-object p1, p1, Lv4/f;->q:Landroid/graphics/RectF;

    iput-object p1, p0, Lv4/f;->q:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    new-instance v0, Lv4/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ls4/g;-><init>(Ls4/f;)V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lv4/g;->N:Lv4/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Ls4/g;->invalidateSelf()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
