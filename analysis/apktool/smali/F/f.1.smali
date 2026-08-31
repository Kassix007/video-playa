.class public final LF/f;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic A:LX/e;

.field public final synthetic B:I

.field public final synthetic C:I

.field public final synthetic q:Lc0/m;

.field public final synthetic r:LF/e;

.field public final synthetic s:LA/L;

.field public final synthetic t:Lx/h;

.field public final synthetic u:Z

.field public final synthetic v:Lv/l;

.field public final synthetic w:F

.field public final synthetic x:Lu0/a;

.field public final synthetic y:Lc0/d;

.field public final synthetic z:Lx/m;


# direct methods
.method public constructor <init>(Lc0/m;LF/e;LA/L;Lx/h;ZLv/l;FLu0/a;Lc0/d;Lx/m;LX/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LF/f;->q:Lc0/m;

    .line 2
    .line 3
    iput-object p2, p0, LF/f;->r:LF/e;

    .line 4
    .line 5
    iput-object p3, p0, LF/f;->s:LA/L;

    .line 6
    .line 7
    iput-object p4, p0, LF/f;->t:Lx/h;

    .line 8
    .line 9
    iput-boolean p5, p0, LF/f;->u:Z

    .line 10
    .line 11
    iput-object p6, p0, LF/f;->v:Lv/l;

    .line 12
    .line 13
    iput p7, p0, LF/f;->w:F

    .line 14
    .line 15
    iput-object p8, p0, LF/f;->x:Lu0/a;

    .line 16
    .line 17
    iput-object p9, p0, LF/f;->y:Lc0/d;

    .line 18
    .line 19
    iput-object p10, p0, LF/f;->z:Lx/m;

    .line 20
    .line 21
    iput-object p11, p0, LF/f;->A:LX/e;

    .line 22
    .line 23
    iput p12, p0, LF/f;->B:I

    .line 24
    .line 25
    iput p13, p0, LF/f;->C:I

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v11, p1

    .line 2
    check-cast v11, LP/o;

    .line 3
    .line 4
    move-object/from16 p1, p2

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    iget p1, p0, LF/f;->B:I

    .line 12
    .line 13
    or-int/lit8 p1, p1, 0x1

    .line 14
    .line 15
    invoke-static {p1}, LP/b;->w(I)I

    .line 16
    .line 17
    .line 18
    move-result v12

    .line 19
    iget p1, p0, LF/f;->C:I

    .line 20
    .line 21
    invoke-static {p1}, LP/b;->w(I)I

    .line 22
    .line 23
    .line 24
    move-result v13

    .line 25
    iget-object v0, p0, LF/f;->q:Lc0/m;

    .line 26
    .line 27
    iget-object v1, p0, LF/f;->r:LF/e;

    .line 28
    .line 29
    iget-object v2, p0, LF/f;->s:LA/L;

    .line 30
    .line 31
    iget-object v3, p0, LF/f;->t:Lx/h;

    .line 32
    .line 33
    iget-boolean v4, p0, LF/f;->u:Z

    .line 34
    .line 35
    iget-object v5, p0, LF/f;->v:Lv/l;

    .line 36
    .line 37
    iget v6, p0, LF/f;->w:F

    .line 38
    .line 39
    iget-object v7, p0, LF/f;->x:Lu0/a;

    .line 40
    .line 41
    iget-object v8, p0, LF/f;->y:Lc0/d;

    .line 42
    .line 43
    iget-object v9, p0, LF/f;->z:Lx/m;

    .line 44
    .line 45
    iget-object v10, p0, LF/f;->A:LX/e;

    .line 46
    .line 47
    invoke-static/range {v0 .. v13}, LD5/a;->g(Lc0/m;LF/e;LA/L;Lx/h;ZLv/l;FLu0/a;Lc0/d;Lx/m;LX/e;LP/o;II)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 51
    .line 52
    return-object p1
.end method
