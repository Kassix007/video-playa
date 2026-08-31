.class public final synthetic Lu2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lu2/o;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lc0/m;

.field public final synthetic t:LB5/c;

.field public final synthetic u:Lc0/e;

.field public final synthetic v:Lz0/j;

.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(Lu2/o;Ljava/lang/String;Lc0/m;LB5/c;Lc0/e;Lz0/j;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/a;->q:Lu2/o;

    iput-object p2, p0, Lu2/a;->r:Ljava/lang/String;

    iput-object p3, p0, Lu2/a;->s:Lc0/m;

    iput-object p4, p0, Lu2/a;->t:LB5/c;

    iput-object p5, p0, Lu2/a;->u:Lc0/e;

    iput-object p6, p0, Lu2/a;->v:Lz0/j;

    iput p7, p0, Lu2/a;->w:I

    iput p8, p0, Lu2/a;->x:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lu2/a;->w:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget p1, p0, Lu2/a;->x:I

    .line 18
    .line 19
    invoke-static {p1}, LP/b;->w(I)I

    .line 20
    .line 21
    .line 22
    move-result v8

    .line 23
    iget-object v0, p0, Lu2/a;->q:Lu2/o;

    .line 24
    .line 25
    iget-object v1, p0, Lu2/a;->r:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Lu2/a;->s:Lc0/m;

    .line 28
    .line 29
    iget-object v3, p0, Lu2/a;->t:LB5/c;

    .line 30
    .line 31
    iget-object v4, p0, Lu2/a;->u:Lc0/e;

    .line 32
    .line 33
    iget-object v5, p0, Lu2/a;->v:Lz0/j;

    .line 34
    .line 35
    invoke-static/range {v0 .. v8}, Lu2/u;->a(Lu2/o;Ljava/lang/String;Lc0/m;LB5/c;Lc0/e;Lz0/j;LP/o;II)V

    .line 36
    .line 37
    .line 38
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 39
    .line 40
    return-object p1
.end method
