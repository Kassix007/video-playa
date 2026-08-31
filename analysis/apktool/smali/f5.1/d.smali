.class public final synthetic Lf5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lc0/m;

.field public final synthetic r:LR4/x;

.field public final synthetic s:F

.field public final synthetic t:LB5/c;

.field public final synthetic u:I

.field public final synthetic v:I


# direct methods
.method public synthetic constructor <init>(Lc0/m;LR4/x;FLB5/c;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/d;->q:Lc0/m;

    iput-object p2, p0, Lf5/d;->r:LR4/x;

    iput p3, p0, Lf5/d;->s:F

    iput-object p4, p0, Lf5/d;->t:LB5/c;

    iput p5, p0, Lf5/d;->u:I

    iput p6, p0, Lf5/d;->v:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lf5/d;->u:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, Lf5/d;->q:Lc0/m;

    .line 18
    .line 19
    iget-object v1, p0, Lf5/d;->r:LR4/x;

    .line 20
    .line 21
    iget v2, p0, Lf5/d;->s:F

    .line 22
    .line 23
    iget-object v3, p0, Lf5/d;->t:LB5/c;

    .line 24
    .line 25
    iget v6, p0, Lf5/d;->v:I

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, LE3/h;->b(Lc0/m;LR4/x;FLB5/c;LP/o;II)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 31
    .line 32
    return-object p1
.end method
