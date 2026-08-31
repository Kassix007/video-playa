.class public final LU0/b;
.super Landroid/text/style/CharacterStyle;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final q:Lj0/l;

.field public final r:F

.field public final s:LP/f0;

.field public final t:LP/C;


# direct methods
.method public constructor <init>(Lj0/l;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/b;->q:Lj0/l;

    .line 5
    .line 6
    iput p2, p0, LU0/b;->r:F

    .line 7
    .line 8
    new-instance p1, Li0/e;

    .line 9
    .line 10
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-direct {p1, v0, v1}, Li0/e;-><init>(J)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, LU0/b;->s:LP/f0;

    .line 23
    .line 24
    new-instance p1, LA0/d;

    .line 25
    .line 26
    const/16 p2, 0xf

    .line 27
    .line 28
    invoke-direct {p1, p2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, LP/b;->m(LB5/a;)LP/C;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, LU0/b;->t:LP/C;

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, LU0/b;->r:F

    .line 2
    .line 3
    invoke-static {p1, v0}, LS0/j;->a(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU0/b;->t:LP/C;

    .line 7
    .line 8
    invoke-virtual {v0}, LP/C;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/graphics/Shader;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    return-void
.end method
