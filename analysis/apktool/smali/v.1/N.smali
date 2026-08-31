.class public final Lv/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/C;


# static fields
.field public static final a:Lv/N;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv/N;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv/N;->a:Lv/N;

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
    sget-object p4, Lv/r;->s:Lv/r;

    .line 10
    .line 11
    sget-object v0, Ln5/t;->q:Ln5/t;

    .line 12
    .line 13
    invoke-interface {p1, p2, p3, v0, p4}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
