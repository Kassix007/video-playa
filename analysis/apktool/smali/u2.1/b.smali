.class public final Lu2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# static fields
.field public static final a:Lu2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu2/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu2/b;->a:Lu2/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Ljava/util/List;J)Lz0/D;
    .locals 1

    .line 1
    invoke-static {p3, p4}, LW0/a;->j(J)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p3, p4}, LW0/a;->i(J)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    new-instance p4, LZ4/G;

    .line 10
    .line 11
    const/16 v0, 0x9

    .line 12
    .line 13
    invoke-direct {p4, v0}, LZ4/G;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Ln5/t;->q:Ln5/t;

    .line 17
    .line 18
    invoke-interface {p1, p2, p3, v0, p4}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
