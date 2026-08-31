.class public final Lv/O;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lo0/b;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lc0/m;

.field public final synthetic t:Lc0/e;

.field public final synthetic u:Lz0/j;

.field public final synthetic v:F

.field public final synthetic w:Lj0/j;

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public constructor <init>(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/O;->q:Lo0/b;

    .line 2
    .line 3
    iput-object p2, p0, Lv/O;->r:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lv/O;->s:Lc0/m;

    .line 6
    .line 7
    iput-object p4, p0, Lv/O;->t:Lc0/e;

    .line 8
    .line 9
    iput-object p5, p0, Lv/O;->u:Lz0/j;

    .line 10
    .line 11
    iput p6, p0, Lv/O;->v:F

    .line 12
    .line 13
    iput-object p7, p0, Lv/O;->w:Lj0/j;

    .line 14
    .line 15
    iput p8, p0, Lv/O;->x:I

    .line 16
    .line 17
    iput p9, p0, Lv/O;->y:I

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lv/O;->x:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget v9, p0, Lv/O;->y:I

    .line 18
    .line 19
    iget-object v0, p0, Lv/O;->q:Lo0/b;

    .line 20
    .line 21
    iget-object v1, p0, Lv/O;->r:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p0, Lv/O;->s:Lc0/m;

    .line 24
    .line 25
    iget-object v3, p0, Lv/O;->t:Lc0/e;

    .line 26
    .line 27
    iget-object v4, p0, Lv/O;->u:Lz0/j;

    .line 28
    .line 29
    iget v5, p0, Lv/O;->v:F

    .line 30
    .line 31
    iget-object v6, p0, Lv/O;->w:Lj0/j;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, LD5/a;->c(Lo0/b;Ljava/lang/String;Lc0/m;Lc0/e;Lz0/j;FLj0/j;LP/o;II)V

    .line 34
    .line 35
    .line 36
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 37
    .line 38
    return-object p1
.end method
